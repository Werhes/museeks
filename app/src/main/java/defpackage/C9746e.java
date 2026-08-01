package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۛؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9746e extends AbstractC13616e implements InterfaceC8501e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public C12020e f19263e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C9156e f19264e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public InterfaceC16154e f19265e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C9630e f19266e;

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, eِ۟ٝ] */
    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        C14434e c14434e = c4017e.f8940e;
        c4017e.ad();
        C9630e c9630e = this.f19266e;
        C7433e c7433e = c9630e.ad;
        InterfaceC16154e interfaceC16154e = AbstractC7890e.billing(c9630e.metrica, AbstractC13703e.ad) ? this.f19265e : this.f19266e.metrica;
        if (this.f19264e == null) {
            this.f19264e = new C9156e(interfaceC16154e, c14434e.f28537e.m4560try(), c4017e.getLayoutDirection(), c4017e);
        }
        if (this.f19263e == null) {
            float mo497instanceof = c4017e.mo497instanceof(c7433e.ad);
            ?? obj = new Object();
            obj.ad = mo497instanceof;
            this.f19263e = obj;
        }
        float f = -c4017e.mo497instanceof(this.f19266e.vip);
        ((C5389e) c14434e.f28537e.f36228e).isPro(f, f, f, f);
        try {
            AbstractC14073e ads = this.f19264e.ads(interfaceC16154e, c4017e.yandex(), c4017e.getLayoutDirection(), c4017e);
            C12020e c12020e = this.f19263e;
            float mo497instanceof2 = c4017e.mo497instanceof(c7433e.ad);
            if (c12020e.vip == null || c12020e.ad != mo497instanceof2) {
                c12020e.ad = mo497instanceof2;
                c12020e.vip = new C13121e(mo497instanceof2, 0.0f, 1, 0, null, 26);
            }
            AbstractC18268e.license(c4017e, ads, c7433e.vip, 1.0f, c12020e.vip, 48);
        } finally {
            float f2 = -f;
            ((C5389e) c14434e.f28537e.f36228e).isPro(f2, f2, f2, f2);
        }
    }
}
