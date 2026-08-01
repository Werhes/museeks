package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7174e {
    public static final C7174e appmetrica;
    public static final C7174e license;
    public static final C7174e metrica;
    public static final C7174e purchase;
    public static final C7174e vip = new C7174e(new C14914e(29));
    public final InterfaceC12217e ad;

    static {
        int i = 0;
        metrica = new C7174e(new C16728e(i));
        new C7174e(new C10215e(i));
        new C7174e(new C11993e(i));
        int i2 = 29;
        license = new C7174e(new C15802e(i2));
        appmetrica = new C7174e(new C5107e(i2));
        purchase = new C7174e(new C12575e(i2));
    }

    public C7174e(InterfaceC8292e interfaceC8292e) {
        if (AbstractC17852e.ad()) {
            this.ad = new C7850e(10, interfaceC8292e);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.ad = new C16089e(interfaceC8292e);
        } else {
            this.ad = new C13935e(interfaceC8292e);
        }
    }
}
