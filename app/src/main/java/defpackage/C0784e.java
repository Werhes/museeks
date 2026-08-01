package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0784e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C12761e f3158e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3159e;

    public /* synthetic */ C0784e(C9326e c9326e, C12761e c12761e) {
        this.f3159e = 2;
        this.f3158e = c12761e;
    }

    public /* synthetic */ C0784e(C12761e c12761e, int i) {
        this.f3159e = i;
        this.f3158e = c12761e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f3159e) {
            case 0:
                C13685e c13685e = (C13685e) obj;
                C13770e c13770e = (C13770e) obj2;
                ((Integer) obj3).getClass();
                C12761e c12761e = this.f3158e;
                String str = c12761e.f25535e;
                long j = C3618e.appmetrica;
                AbstractC11538e.ad(str, null, new C14323e(new C8052e(j), new C12973e(AbstractC13362e.startapp(21)), new C14911e("sans-serif-medium", 0), 60), 1, c13770e, 3072, 2);
                String str2 = c12761e.f25534e;
                C14323e c14323e = new C14323e(new C8052e(C3618e.vip(0.5f, j)), new C12973e(AbstractC13362e.startapp(16)), C14911e.f29547e, 60);
                float f = 8;
                float f2 = 0;
                float f3 = (7 & 2) != 0 ? 0 : 0.0f;
                float f4 = (7 & 4) != 0 ? 0 : 0.0f;
                if ((8 & 7) != 0) {
                    f = 0;
                }
                AbstractC11538e.ad(str2, new C4293e(AbstractC14430e.advert(f2), AbstractC14430e.advert(f3), AbstractC14430e.advert(f4), AbstractC14430e.advert(f)), c14323e, 1, c13770e, 3072, 0);
                C12005e c12005e = new C12005e(C6705e.ad);
                c13685e.getClass();
                AbstractC12751e.vip(c12005e.purchase(new C8851e(C9361e.ad)), 0, AbstractC16653e.license(1807698669, new C0784e(c12761e, 1), c13770e), c13770e, 3072, 6);
                return Unit.INSTANCE;
            case 1:
                boolean z = this.f3158e.f25531e;
                C2670e c2670e = (C2670e) obj;
                C13770e c13770e2 = (C13770e) obj2;
                ((Integer) obj3).getClass();
                C6479e c6479e = new C6479e(R.drawable.player_previous);
                C15492e c15492e = AbstractC4449e.vip;
                String string = ((Context) c13770e2.adcel(c15492e)).getString(R.string.now_playing_previous);
                C6705e c6705e = C6705e.ad;
                float f5 = 8;
                InterfaceC7189e billing = AbstractC14430e.billing(c2670e.ad(new C8851e(c6705e)), 0.0f, f5, 1);
                Object m3681throw = c13770e2.m3681throw();
                C5170e c5170e = C2987e.ad;
                if (m3681throw == c5170e) {
                    m3681throw = new C11689e(4);
                    c13770e2.m3682throws(m3681throw);
                }
                AbstractC8141e.metrica(c6479e, string, AbstractC15077e.mopub(billing, AbstractC6762e.vip((Function0) m3681throw, c13770e2)), 0, null, c13770e2, 0, 24);
                C6479e c6479e2 = new C6479e(z ? R.drawable.player_play : R.drawable.player_pause);
                String string2 = ((Context) c13770e2.adcel(c15492e)).getString(z ? R.string.now_playing_play : R.string.now_playing_pause);
                InterfaceC7189e billing2 = AbstractC14430e.billing(c2670e.ad(new C8851e(c6705e)), 0.0f, f5, 1);
                Object m3681throw2 = c13770e2.m3681throw();
                if (m3681throw2 == c5170e) {
                    m3681throw2 = new C11689e(5);
                    c13770e2.m3682throws(m3681throw2);
                }
                AbstractC8141e.metrica(c6479e2, string2, AbstractC15077e.mopub(billing2, AbstractC6762e.vip((Function0) m3681throw2, c13770e2)), 0, null, c13770e2, 0, 24);
                C6479e c6479e3 = new C6479e(R.drawable.player_next);
                String string3 = ((Context) c13770e2.adcel(c15492e)).getString(R.string.now_playing_next);
                InterfaceC7189e billing3 = AbstractC14430e.billing(c2670e.ad(new C8851e(c6705e)), 0.0f, f5, 1);
                Object m3681throw3 = c13770e2.m3681throw();
                if (m3681throw3 == c5170e) {
                    m3681throw3 = new C11689e(6);
                    c13770e2.m3682throws(m3681throw3);
                }
                AbstractC8141e.metrica(c6479e3, string3, AbstractC15077e.mopub(billing3, AbstractC6762e.vip((Function0) m3681throw3, c13770e2)), 0, null, c13770e2, 0, 24);
                return Unit.INSTANCE;
            default:
                C2670e c2670e2 = (C2670e) obj;
                C13770e c13770e3 = (C13770e) obj2;
                ((Integer) obj3).getClass();
                C6479e c6479e4 = new C6479e(R.drawable.player_previous);
                C15492e c15492e2 = AbstractC4449e.vip;
                String string4 = ((Context) c13770e3.adcel(c15492e2)).getString(R.string.now_playing_previous);
                C6705e c6705e2 = C6705e.ad;
                AbstractC8141e.metrica(c6479e4, string4, AbstractC15077e.mopub(c2670e2.ad(new C8851e(c6705e2)), C9326e.mopub(c13770e3, 6)), 0, null, c13770e3, 0, 24);
                boolean z2 = this.f3158e.f25531e;
                AbstractC8141e.metrica(new C6479e(z2 ? R.drawable.player_play : R.drawable.player_pause), ((Context) c13770e3.adcel(c15492e2)).getString(z2 ? R.string.now_playing_play : R.string.now_playing_pause), AbstractC15077e.mopub(c2670e2.ad(new C8851e(c6705e2)), C9326e.mopub(c13770e3, 1)), 0, null, c13770e3, 0, 24);
                AbstractC8141e.metrica(new C6479e(R.drawable.player_next), ((Context) c13770e3.adcel(c15492e2)).getString(R.string.now_playing_next), AbstractC15077e.mopub(c2670e2.ad(new C8851e(c6705e2)), C9326e.mopub(c13770e3, 8)), 0, null, c13770e3, 0, 24);
                return Unit.INSTANCE;
        }
    }
}
