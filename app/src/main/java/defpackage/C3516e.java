package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3516e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC16049e f7941e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7942e;

    public /* synthetic */ C3516e(AbstractC16049e abstractC16049e, int i) {
        this.f7942e = i;
        this.f7941e = abstractC16049e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f7942e;
        AbstractC16049e abstractC16049e = this.f7941e;
        switch (i) {
            case 0:
                return C12761e.vip((C12761e) obj, false, abstractC16049e.getVip(), abstractC16049e.getMetrica(), C16129e.purchase(abstractC16049e), 34);
            case 1:
                CachedTrack cachedTrack = (CachedTrack) ((C5114e) obj).m1758e(AbstractC3820e.ad.vip(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{AbstractC6914e.billing((AudioTrack) abstractC16049e)}, 1)).license().ad();
                if (cachedTrack != null) {
                    cachedTrack.m4735static(null);
                }
                return Unit.INSTANCE;
            default:
                InterfaceC12406e interfaceC12406e = (InterfaceC12406e) obj;
                int i2 = PlaybackService.f36732e;
                if (((Boolean) AbstractC16524e.admob.ad()).booleanValue()) {
                    ((C17148e) interfaceC12406e).m4262e(0);
                } else {
                    ((C17148e) interfaceC12406e).m4262e(((abstractC16049e instanceof InterfaceC14744e) && ((InterfaceC14744e) abstractC16049e).license()) ? 1 : 2);
                }
                return Unit.INSTANCE;
        }
    }
}
