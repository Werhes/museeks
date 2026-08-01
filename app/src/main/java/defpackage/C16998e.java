package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16998e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f33300e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C1718e f33301e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f33302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16998e(AudioTrack audioTrack, C1718e c1718e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f33300e = i;
        this.f33302e = audioTrack;
        this.f33301e = c1718e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f33300e) {
            case 0:
                return new C16998e(this.f33302e, this.f33301e, interfaceC5083e, 0);
            default:
                return new C16998e(this.f33302e, this.f33301e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f33300e) {
            case 0:
                return ((C16998e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C16998e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f33300e) {
            case 0:
                AbstractC2003e.purchase(obj);
                AudioTrack audioTrack = this.f33302e;
                audioTrack.metrica(true);
                this.f33301e.f4677e.add(AbstractC6914e.billing(audioTrack));
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                AudioTrack audioTrack2 = this.f33302e;
                audioTrack2.metrica(false);
                this.f33301e.f4677e.remove(AbstractC6914e.billing(audioTrack2));
                return Unit.INSTANCE;
        }
    }
}
