package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15252e extends AbstractC16997e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final String f30185e;

    public C15252e(Throwable th) {
        super(false, 3);
        StringBuilder sb = new StringBuilder("8.12.1_pub 99167\n---\n");
        if (!(th instanceof IllegalAccessError)) {
            if (th instanceof C0907e) {
                sb.append("VKException: " + ((C0907e) th).vip());
                sb.append("\n---\n");
            }
            sb.append(th.getMessage());
            sb.append("\n---\n");
            sb.append(AbstractC13362e.advert(th));
        }
        this.f30185e = sb.toString();
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(1787440728);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(-973031587, new C9101e(this), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9101e(this, i);
        }
    }
}
