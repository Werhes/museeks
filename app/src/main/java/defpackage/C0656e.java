package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؑٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0656e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f2922e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2923e;

    public /* synthetic */ C0656e(AudioTrack audioTrack, int i) {
        this.f2923e = i;
        this.f2922e = audioTrack;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2923e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AudioTrack audioTrack = this.f2922e;
                    String str = audioTrack.license;
                    boolean purchase = c13770e.purchase(audioTrack);
                    Object m3681throw = c13770e.m3681throw();
                    if (purchase || m3681throw == C2987e.ad) {
                        m3681throw = audioTrack.tapsense();
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC6401e.metrica(str, (String) m3681throw, 0L, 0L, null, c13770e, 0, 28);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC14489e.vip(this.f2922e.ad, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e2, 0, 24960, 241662);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
