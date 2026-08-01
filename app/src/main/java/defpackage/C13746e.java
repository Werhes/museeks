package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؔٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13746e implements InterfaceC3043e {
    public final /* synthetic */ int ad;
    public static final C13746e vip = new C13746e(0);
    public static final C13746e metrica = new C13746e(1);
    public static final C13746e license = new C13746e(2);
    public static final C13746e appmetrica = new C13746e(3);
    public static final C13746e purchase = new C13746e(4);
    public static final C13746e billing = new C13746e(5);
    public static final C13746e yandex = new C13746e(6);
    public static final C13746e startapp = new C13746e(7);
    public static final C13746e adcel = new C13746e(8);
    public static final C13746e mopub = new C13746e(9);
    public static final C13746e advert = new C13746e(10);
    public static final C13746e smaato = new C13746e(11);
    public static final C13746e amazon = new C13746e(12);
    public static final C13746e loadAd = new C13746e(13);
    public static final C13746e Signature = new C13746e(14);

    public /* synthetic */ C13746e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC3043e
    public final boolean ad(int i) {
        switch (this.ad) {
            case 0:
                return EnumC16535e.vip(i) != null;
            case 1:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 2:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 3:
                return i == 0 || i == 1 || i == 2;
            case 4:
                return AbstractC10423e.metrica(i) != 0;
            case 5:
                return i == 0 || i == 1 || i == 2;
            case 6:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            case 7:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 8:
                return i == 0 || i == 1 || i == 2;
            case 9:
                return i == 0 || i == 1;
            case 10:
                return i == 1 || i == 2;
            case 11:
                return AbstractC1414e.vip(i) != 0;
            case 12:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            case 13:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            default:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
        }
    }
}
