package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًً, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7798e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f15799e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AudioPlaylist f15800e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f15801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7798e(int i, InterfaceC5083e interfaceC5083e, AudioPlaylist audioPlaylist) {
        super(2, interfaceC5083e);
        this.f15799e = i;
        this.f15800e = audioPlaylist;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f15799e) {
            case 0:
                return new C7798e(0, interfaceC5083e, this.f15800e);
            default:
                return new C7798e(1, interfaceC5083e, this.f15800e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f15799e) {
            case 0:
                return ((C7798e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C7798e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f15799e;
        AudioPlaylist audioPlaylist = this.f15800e;
        Object obj2 = EnumC2821e.f6782e;
        switch (i) {
            case 0:
                int i2 = this.f15801e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f15801e = 1;
                    C0086e c0086e = C0086e.billing;
                    C16482e c16482e = new C16482e(AbstractC13406e.pro(audioPlaylist), audioPlaylist.subs);
                    Object advert = AbstractC5336e.advert(AbstractC6731e.ad, new C6046e(C0086e.billing, c16482e, (InterfaceC5083e) null, 1), this);
                    if (advert != obj2) {
                        advert = Unit.INSTANCE;
                    }
                    if (advert != obj2) {
                        advert = Unit.INSTANCE;
                    }
                    if (advert == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i3 = this.f15801e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    this.f15801e = 1;
                    C0086e c0086e2 = C0086e.billing;
                    C16482e c16482e2 = new C16482e(AbstractC13406e.pro(audioPlaylist), audioPlaylist.subs);
                    Object advert2 = AbstractC5336e.advert(AbstractC6731e.ad, new C6046e(C0086e.billing, c16482e2, (InterfaceC5083e) null, 1), this);
                    if (advert2 != obj2) {
                        advert2 = Unit.INSTANCE;
                    }
                    if (advert2 != obj2) {
                        advert2 = Unit.INSTANCE;
                    }
                    if (advert2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
