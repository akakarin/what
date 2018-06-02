package Enums;

public enum NavbarEnum {
    NEW_IN("1020946c-8949-4e9c-9719-43435002bcd4"),
    CLOTHING("96b432e3-d374-4293-8145-b00772447cde"),
    SHOES("0edf7894-4f2f-42fb-896d-3e91a01704b1"),
    ACCSSORIES("415ffca1-8c1a-48a7-8997-9cc4929a7134"),
    ACTIVEWEAR("d21e53a8-79e6-491d-91b3-8c0e2c21a3a1"),
    FACE_BODY("b2164f1d-48aa-417d-9d1a-5cffa7eb1bb2"),
    GIFTS("1ba15282-450e-4b5a-96cc-0b2eebc1d379"),
    BRANDS("796c1478-6471-4acf-a952-049a9154b668"),
    MARKET_PLACE("58b7bec6-2318-4e4e-a97d-e5acdb8cb269"),
    INSPIRATION("f801c24f-60c9-459a-a021-ea6a313adf0a");

    private String dataId;

    NavbarEnum(String dataId) {
        this.dataId = dataId;
    }

    public String getDataId() {
        return dataId;
    }
}
