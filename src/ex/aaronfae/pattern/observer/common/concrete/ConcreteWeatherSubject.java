package ex.aaronfae.pattern.observer.common.concrete;
/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 * 
 * @author AaronFae
 *
 */
public class ConcreteWeatherSubject extends WeatherSubject {
	// 获取天气的内容信息
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		// 内容有了，说明天气更行了，通知所以订阅了天气的人
		this.notifyObservers();
	}

}
