package com.base.java.enum1;


/**
 * ���: ���弾��
 */
public enum Season {

    //�ṩö��������޵�  ȷ���Ķ���--->enumö����Ҫ����󣨳�������������ʼλ��
    //�������֮���ã��������ӣ����һ�����������;����
    SPRING("����", "��ů����"),
    SUMMER("����", "��������"),
    AUTUMN("����", "˶������"),
    WINTER("����", "����ѩ��");

    //���ԣ�
    private final String seasonName;//��������
    private final String seasonDesc;//��������

    //���ù����������Խ��и�ֵ������
    //������˽�л�����粻�ܵ��������������ֻ��Season�ڲ��Լ�����
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //�������أ�
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //toString();
    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}