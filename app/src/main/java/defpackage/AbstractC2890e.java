package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2890e {
    public static final C12328e ad = new C12328e();
    public static final C12328e vip = new C12328e();
    public static final C0583e metrica = new C0583e();
    public static final C0583e license = new C0583e();

    public static C5181e ad(int i) {
        Integer valueOf = Integer.valueOf(i);
        C0583e c0583e = license;
        C5181e c5181e = (C5181e) c0583e.billing(valueOf);
        return c5181e == null ? (C5181e) c0583e.billing(0) : c5181e;
    }
}
