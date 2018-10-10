package sri.oasis.weather.webservice


class APIError {

    private var message = ""

    private var status_code: Int = 0

    fun message(): String {
        return message
    }

    fun setMessage(message: String) {
        this.message = message
    }

    fun statusCode(): Int {
        return status_code
    }

    fun setStatus_code(status_code: Int) {
        this.status_code = status_code
    }

    override fun toString(): String {
        return "ApiError{" +
                "status_code='" + status_code + '\'' +
                ", message='" + message + '\'' +
                '}'
    }
}