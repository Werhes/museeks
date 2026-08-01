package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6252e extends Cpackage {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f13068e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ String f13069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6252e(String str, int i) {
        super(12);
        this.f13068e = i;
        this.f13069e = str;
    }

    @Override // defpackage.Cpackage
    /* renamed from: eًؕۙ */
    public final AbstractC18406e mo774e() {
        switch (this.f13068e) {
            case 0:
                String str = this.f13069e;
                if (str != null) {
                    return new C4600e(str, 17);
                }
                StringBuilder sb = new StringBuilder("https://vk.com/audios");
                C14027e.ad.getClass();
                sb.append(C14027e.metrica());
                sb.append("?section=podcasts");
                return new C4600e(sb.toString(), 7);
            case 1:
                return new C4600e((String) null, 1, this.f13069e);
            case 2:
                return new C4600e(this.f13069e, 2, (String) null);
            default:
                return new C4600e(this.f13069e, 12);
        }
    }

    @Override // defpackage.Cpackage
    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public boolean mo2058e() {
        switch (this.f13068e) {
            case 3:
                return false;
            default:
                return super.mo2058e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eۦؕ, java.lang.Object] */
    @Override // defpackage.Cpackage
    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public AbstractC18491e mo2059e() {
        switch (this.f13068e) {
            case 3:
                return new Object();
            default:
                return super.mo2059e();
        }
    }
}
