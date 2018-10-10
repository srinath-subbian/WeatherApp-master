package sri.oasis.weather.model;

@com.raizlabs.android.dbflow.annotation.Table(name = "WeatherForecast", database = sri.oasis.weather.dbconfig.WeatherStreamDB.class)
@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 (2\u00020\u0001:\u0004\'()*B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001b\u00a8\u0006+"}, d2 = {"Lsri/oasis/weather/model/WeatherForecastData;", "Lcom/raizlabs/android/dbflow/structure/BaseModel;", "id", "", "message", "", "cnt", "cod", "dt", "list", "", "Lsri/oasis/weather/model/WeatherForecastData$ForecastList;", "city", "Lsri/oasis/weather/model/WeatherForecastData$City;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;[Lsri/oasis/weather/model/WeatherForecastData$ForecastList;Lsri/oasis/weather/model/WeatherForecastData$City;)V", "getCity", "()Lsri/oasis/weather/model/WeatherForecastData$City;", "setCity", "(Lsri/oasis/weather/model/WeatherForecastData$City;)V", "getCnt", "()Ljava/lang/Long;", "setCnt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCod", "()Ljava/lang/String;", "setCod", "(Ljava/lang/String;)V", "getDt", "setDt", "getId", "setId", "getList", "()[Lsri/oasis/weather/model/WeatherForecastData$ForecastList;", "setList", "([Lsri/oasis/weather/model/WeatherForecastData$ForecastList;)V", "[Lsri/oasis/weather/model/WeatherForecastData$ForecastList;", "getMessage", "setMessage", "City", "Companion", "ForecastList", "Rain", "app_debug"})
public final class WeatherForecastData extends com.raizlabs.android.dbflow.structure.BaseModel {
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.PrimaryKey()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.Long cnt;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.String cod;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.Long dt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private sri.oasis.weather.model.WeatherForecastData.ForecastList[] list;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private sri.oasis.weather.model.WeatherForecastData.City city;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_NAME = "WeatherForecast";
    public static final sri.oasis.weather.model.WeatherForecastData.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCnt() {
        return null;
    }
    
    public final void setCnt(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCod() {
        return null;
    }
    
    public final void setCod(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDt() {
        return null;
    }
    
    public final void setDt(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final sri.oasis.weather.model.WeatherForecastData.ForecastList[] getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable()
    sri.oasis.weather.model.WeatherForecastData.ForecastList[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final sri.oasis.weather.model.WeatherForecastData.City getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.Nullable()
    sri.oasis.weather.model.WeatherForecastData.City p0) {
    }
    
    public WeatherForecastData(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Long cnt, @org.jetbrains.annotations.Nullable()
    java.lang.String cod, @org.jetbrains.annotations.Nullable()
    java.lang.Long dt, @org.jetbrains.annotations.Nullable()
    sri.oasis.weather.model.WeatherForecastData.ForecastList[] list, @org.jetbrains.annotations.Nullable()
    sri.oasis.weather.model.WeatherForecastData.City city) {
        super();
    }
    
    public WeatherForecastData() {
        super();
    }
    
    @com.raizlabs.android.dbflow.annotation.Table(name = "ForecastList", database = sri.oasis.weather.dbconfig.WeatherStreamDB.class)
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\'\b\u0007\u0018\u0000 92\u00020\u0001:\u00019Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u00a8\u0006:"}, d2 = {"Lsri/oasis/weather/model/WeatherForecastData$ForecastList;", "Lcom/raizlabs/android/dbflow/structure/BaseModel;", "id", "", "clouds", "Lsri/oasis/weather/model/WeatherData$Clouds;", "dt", "wind", "Lsri/oasis/weather/model/WeatherData$Wind;", "sys", "Lsri/oasis/weather/model/WeatherData$Sys;", "weather", "", "Lsri/oasis/weather/model/WeatherData$Weather;", "dt_txt", "", "rain", "Lsri/oasis/weather/model/WeatherForecastData$Rain;", "main", "Lsri/oasis/weather/model/WeatherData$Main;", "(Ljava/lang/Long;Lsri/oasis/weather/model/WeatherData$Clouds;Ljava/lang/Long;Lsri/oasis/weather/model/WeatherData$Wind;Lsri/oasis/weather/model/WeatherData$Sys;[Lsri/oasis/weather/model/WeatherData$Weather;Ljava/lang/String;Lsri/oasis/weather/model/WeatherForecastData$Rain;Lsri/oasis/weather/model/WeatherData$Main;)V", "getClouds", "()Lsri/oasis/weather/model/WeatherData$Clouds;", "setClouds", "(Lsri/oasis/weather/model/WeatherData$Clouds;)V", "getDt", "()Ljava/lang/Long;", "setDt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDt_txt", "()Ljava/lang/String;", "setDt_txt", "(Ljava/lang/String;)V", "getId", "setId", "getMain", "()Lsri/oasis/weather/model/WeatherData$Main;", "setMain", "(Lsri/oasis/weather/model/WeatherData$Main;)V", "getRain", "()Lsri/oasis/weather/model/WeatherForecastData$Rain;", "setRain", "(Lsri/oasis/weather/model/WeatherForecastData$Rain;)V", "getSys", "()Lsri/oasis/weather/model/WeatherData$Sys;", "setSys", "(Lsri/oasis/weather/model/WeatherData$Sys;)V", "getWeather", "()[Lsri/oasis/weather/model/WeatherData$Weather;", "setWeather", "([Lsri/oasis/weather/model/WeatherData$Weather;)V", "[Lsri/oasis/weather/model/WeatherData$Weather;", "getWind", "()Lsri/oasis/weather/model/WeatherData$Wind;", "setWind", "(Lsri/oasis/weather/model/WeatherData$Wind;)V", "Companion", "app_debug"})
    public static final class ForecastList extends com.raizlabs.android.dbflow.structure.BaseModel {
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.PrimaryKey(autoincrement = true)
        @com.raizlabs.android.dbflow.annotation.Column()
        private java.lang.Long id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        private sri.oasis.weather.model.WeatherData.Clouds clouds;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Long dt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        private sri.oasis.weather.model.WeatherData.Wind wind;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        private sri.oasis.weather.model.WeatherData.Sys sys;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        private sri.oasis.weather.model.WeatherData.Weather[] weather;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String dt_txt;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        private sri.oasis.weather.model.WeatherForecastData.Rain rain;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        private sri.oasis.weather.model.WeatherData.Main main;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "ForecastList";
        public static final sri.oasis.weather.model.WeatherForecastData.ForecastList.Companion Companion = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final sri.oasis.weather.model.WeatherData.Clouds getClouds() {
            return null;
        }
        
        public final void setClouds(@org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherData.Clouds p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getDt() {
            return null;
        }
        
        public final void setDt(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final sri.oasis.weather.model.WeatherData.Wind getWind() {
            return null;
        }
        
        public final void setWind(@org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherData.Wind p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final sri.oasis.weather.model.WeatherData.Sys getSys() {
            return null;
        }
        
        public final void setSys(@org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherData.Sys p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final sri.oasis.weather.model.WeatherData.Weather[] getWeather() {
            return null;
        }
        
        public final void setWeather(@org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherData.Weather[] p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDt_txt() {
            return null;
        }
        
        public final void setDt_txt(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final sri.oasis.weather.model.WeatherForecastData.Rain getRain() {
            return null;
        }
        
        public final void setRain(@org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherForecastData.Rain p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final sri.oasis.weather.model.WeatherData.Main getMain() {
            return null;
        }
        
        public final void setMain(@org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherData.Main p0) {
        }
        
        public ForecastList(@org.jetbrains.annotations.Nullable()
        java.lang.Long id, @org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherData.Clouds clouds, @org.jetbrains.annotations.Nullable()
        java.lang.Long dt, @org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherData.Wind wind, @org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherData.Sys sys, @org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherData.Weather[] weather, @org.jetbrains.annotations.Nullable()
        java.lang.String dt_txt, @org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherForecastData.Rain rain, @org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherData.Main main) {
            super();
        }
        
        public ForecastList() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lsri/oasis/weather/model/WeatherForecastData$ForecastList$Companion;", "", "()V", "TABLE_NAME", "", "getForecastList", "", "Lsri/oasis/weather/model/WeatherForecastData$ForecastList;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<sri.oasis.weather.model.WeatherForecastData.ForecastList> getForecastList() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lsri/oasis/weather/model/WeatherForecastData$City;", "", "id", "", "name", "", "country", "coord", "Lsri/oasis/weather/model/WeatherData$Coord;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lsri/oasis/weather/model/WeatherData$Coord;)V", "getCoord", "()Lsri/oasis/weather/model/WeatherData$Coord;", "setCoord", "(Lsri/oasis/weather/model/WeatherData$Coord;)V", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getName", "setName", "app_debug"})
    public static final class City {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        private java.lang.Long id;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        private java.lang.String country;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.Expose()
        private sri.oasis.weather.model.WeatherData.Coord coord;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountry() {
            return null;
        }
        
        public final void setCountry(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final sri.oasis.weather.model.WeatherData.Coord getCoord() {
            return null;
        }
        
        public final void setCoord(@org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherData.Coord p0) {
        }
        
        public City(@org.jetbrains.annotations.Nullable()
        java.lang.Long id, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        sri.oasis.weather.model.WeatherData.Coord coord) {
            super();
        }
        
        public City() {
            super();
        }
    }
    
    @com.raizlabs.android.dbflow.annotation.Table(name = "Rain", database = sri.oasis.weather.dbconfig.WeatherStreamDB.class)
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lsri/oasis/weather/model/WeatherForecastData$Rain;", "Lcom/raizlabs/android/dbflow/structure/BaseModel;", "id", "", "dt", "rainCount", "", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;)V", "getDt", "()Ljava/lang/Long;", "setDt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getId", "setId", "getRainCount", "()Ljava/lang/Double;", "setRainCount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "Companion", "app_debug"})
    public static final class Rain extends com.raizlabs.android.dbflow.structure.BaseModel {
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.PrimaryKey(autoincrement = true)
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Long id;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Long dt;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        @com.google.gson.annotations.SerializedName(value = "3h")
        private java.lang.Double rainCount;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "Rain";
        public static final sri.oasis.weather.model.WeatherForecastData.Rain.Companion Companion = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getDt() {
            return null;
        }
        
        public final void setDt(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getRainCount() {
            return null;
        }
        
        public final void setRainCount(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        public Rain(@org.jetbrains.annotations.Nullable()
        java.lang.Long id, @org.jetbrains.annotations.Nullable()
        java.lang.Long dt, @org.jetbrains.annotations.Nullable()
        java.lang.Double rainCount) {
            super();
        }
        
        public Rain() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lsri/oasis/weather/model/WeatherForecastData$Rain$Companion;", "", "()V", "TABLE_NAME", "", "getRainData", "Lsri/oasis/weather/model/WeatherForecastData$Rain;", "dt", "", "(Ljava/lang/Long;)Lsri/oasis/weather/model/WeatherForecastData$Rain;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final sri.oasis.weather.model.WeatherForecastData.Rain getRainData(@org.jetbrains.annotations.Nullable()
            java.lang.Long dt) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lsri/oasis/weather/model/WeatherForecastData$Companion;", "", "()V", "TABLE_NAME", "", "getWeatherForecastDetails", "Lsri/oasis/weather/model/WeatherForecastData;", "getWeatherForecastList", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final sri.oasis.weather.model.WeatherForecastData getWeatherForecastDetails() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<sri.oasis.weather.model.WeatherForecastData> getWeatherForecastList() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}