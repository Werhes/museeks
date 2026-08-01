package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9422e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f18758e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18759e;

    public /* synthetic */ C9422e(AudioTrack audioTrack, int i) {
        this.f18759e = i;
        this.f18758e = audioTrack;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18759e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC8636e.ad(this.f18758e, 0, 0L, 0L, 0, 0.0f, false, null, null, null, c13770e, 0, 1022);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AudioTrack audioTrack = this.f18758e;
                    AbstractC6401e.metrica(audioTrack.license, audioTrack.subscription, 0L, 0L, null, c13770e2, 0, 28);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AbstractC14489e.vip(this.f18758e.ad, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e3, 0, 24960, 241662);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
