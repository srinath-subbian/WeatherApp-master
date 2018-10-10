package sri.oasis.weather.fragments

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import android.support.v4.app.Fragment
import sri.oasis.weather.MainActivity
import sri.oasis.weather.Methods
import sri.oasis.weather.utilities.ConnectionChecker
import sri.oasis.weather.utilities.FragmentUtil
import sri.oasis.weather.utilities.PreferenceUtil
import sri.oasis.weather.webservice.ErrorHandler



open class BaseFragment : Fragment() {

    lateinit var mActivity: MainActivity
    lateinit var fragmentUtil: FragmentUtil
    lateinit var mResources: Resources
    lateinit var connectionChecker: ConnectionChecker
    lateinit var preferenceUtil: PreferenceUtil
    lateinit var errorHandler: ErrorHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mActivity = activity as MainActivity
        fragmentUtil = FragmentUtil(mActivity)
        preferenceUtil = PreferenceUtil(mActivity)
        mResources = mActivity.resources
        connectionChecker = ConnectionChecker(mActivity)
        errorHandler = ErrorHandler(mActivity)

        Methods(mActivity)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        view!!.setOnClickListener { }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mActivity = activity as MainActivity
    }
}