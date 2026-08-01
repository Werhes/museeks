package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۥٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15084e extends Cpackage {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f29865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15084e(int i) {
        super(12);
        this.f29865e = i;
    }

    @Override // defpackage.Cpackage
    /* renamed from: eًؕۙ */
    public final AbstractC18406e mo774e() {
        switch (this.f29865e) {
            case 0:
                StringBuilder sb = new StringBuilder("https://vk.com/audios");
                C14027e.ad.getClass();
                sb.append(C14027e.metrica());
                sb.append("?section=general");
                C4600e c4600e = new C4600e(sb.toString(), 7);
                C5363e c5363e = C0308e.appmetrica;
                c4600e.vip = AbstractC18271e.metrica().license.pro();
                return c4600e;
            default:
                C4227e c4227e = new C4227e();
                C7947e.ad.getClass();
                if (((Boolean) C7947e.metrica.ad()).booleanValue()) {
                    C5363e c5363e2 = C0308e.appmetrica;
                    c4227e.vip = AbstractC18271e.metrica().metrica.pro();
                } else {
                    C5363e c5363e3 = C0308e.appmetrica;
                    c4227e.vip = AbstractC18271e.metrica().vip.pro();
                }
                return c4227e;
        }
    }

    @Override // defpackage.Cpackage
    /* renamed from: eًۛٝ */
    public final boolean mo2058e() {
        switch (this.f29865e) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eۦؕ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [eۦؕ, java.lang.Object] */
    @Override // defpackage.Cpackage
    /* renamed from: eَٕٞ */
    public final AbstractC18491e mo2059e() {
        switch (this.f29865e) {
            case 0:
                return new Object();
            default:
                return new Object();
        }
    }
}
