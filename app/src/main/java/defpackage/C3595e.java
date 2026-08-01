package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3595e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f8125e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ int f8126e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f8127e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3595e(int i, int i2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f8127e = i;
        this.f8126e = i2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C3595e(this.f8127e, this.f8126e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3595e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f8125e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C15802e c15802e = C15802e.f31123e;
            long j = this.f8126e;
            this.f8125e = 1;
            obj = c15802e.Signature(this.f8127e, j, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (obj == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        CachedPlaylist cachedPlaylist = (CachedPlaylist) obj;
        if (cachedPlaylist == null) {
            return "{}";
        }
        AudioPlaylist metrica = cachedPlaylist.metrica();
        return AbstractC16704e.ad(VKXApplication.f36533e, AbstractC3820e.ad(AudioPlaylist.class)).appmetrica(AudioPlaylist.startapp(metrica, metrica.f36507final, -9175041));
    }
}
