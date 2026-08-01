package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10176e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11001e f20132e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AudioPlaylist f20133e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C11204e f20134e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20135e;

    public /* synthetic */ C10176e(AudioPlaylist audioPlaylist, C11001e c11001e, C11204e c11204e, int i) {
        this.f20135e = i;
        this.f20133e = audioPlaylist;
        this.f20132e = c11001e;
        this.f20134e = c11204e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20135e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC6022e.vip(null, AbstractC16653e.license(1895128054, new C10176e(this.f20133e, this.f20132e, this.f20134e, 1), c13770e), c13770e, 48, 1);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC0865e.ad(AbstractC12220e.loadAd(C0115e.f1276e, 0.0f, 8, 0.0f, 0.0f, 13), null, null, null, null, AbstractC16653e.license(-100648380, new C8124e(1, this.f20133e, this.f20132e, this.f20134e), c13770e2), c13770e2, 196614, 30);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
