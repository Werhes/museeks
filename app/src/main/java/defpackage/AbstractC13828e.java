package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13828e extends AbstractC17001e {
    public static final C16363e metrica = new C16363e(0);
    public static final C16363e license = new C16363e(1);
    public static final C16363e appmetrica = new C16363e(2);
    public static final C14916e purchase = new C14916e();
    public static final C16363e billing = new C16363e(3);
    public static final C16363e yandex = new C16363e(4);
    public static final C16363e startapp = new C16363e(5);
    public static final C15244e adcel = new Object();

    @Override // defpackage.AbstractC17001e, defpackage.InterfaceC16282e
    public final void ad(C15816e c15816e, C11154e c11154e) {
        C2697e c2697e = c11154e.vip;
        if (c2697e != null) {
            appmetrica(c15816e, c2697e);
        }
    }

    public abstract void appmetrica(C15816e c15816e, C2697e c2697e);
}
