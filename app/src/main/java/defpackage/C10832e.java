package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10832e extends AbstractC14291e {
    public static final AbstractC14291e appmetrica;
    public static final AbstractC14291e purchase;

    static {
        AbstractC14291e vip = new AbstractC14291e(null, new C17519e(0)).vip();
        appmetrica = vip;
        AbstractC14291e abstractC14291e = new AbstractC14291e(vip, new C17519e(0));
        boolean z = !abstractC14291e.metrica;
        Boolean bool = Boolean.TRUE;
        AbstractC2301e.admob("Can't mutate after handing to trace", z);
        AbstractC2301e.admob("Key already present", !abstractC14291e.metrica());
        abstractC14291e.vip.put(AbstractC14291e.license, bool);
        purchase = abstractC14291e.vip();
    }
}
