package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f2826e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C1718e f2827e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f2828e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0618e(C1718e c1718e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f2826e = i;
        this.f2827e = c1718e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f2826e) {
            case 0:
                return new C0618e(this.f2827e, interfaceC5083e, 0);
            default:
                return new C0618e(this.f2827e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f2826e) {
            case 0:
                return ((C0618e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C0618e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f2826e) {
            case 0:
                int i = this.f2828e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    C1718e c1718e = this.f2827e;
                    if (c1718e.f4674e.isEmpty()) {
                        this.f2828e = 1;
                        Object m679package = C1718e.m679package(c1718e, this);
                        EnumC2821e enumC2821e = EnumC2821e.f6782e;
                        if (m679package == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            default:
                int i2 = this.f2828e;
                C1718e c1718e2 = this.f2827e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    AudioSnippetEntry audioSnippetEntry = (AudioSnippetEntry) AbstractC13480e.m3592native(c1718e2.f4675e.purchase(), c1718e2.f4674e);
                    if (audioSnippetEntry == null) {
                        return Unit.INSTANCE;
                    }
                    AudioTrack audioTrack = (AudioTrack) AbstractC13480e.m3592native(c1718e2.f4672e.purchase(), audioSnippetEntry.billing);
                    if (audioTrack == null) {
                        return Unit.INSTANCE;
                    }
                    C18231e c18231e = new C18231e(audioSnippetEntry.yandex, audioSnippetEntry.vip);
                    String purchase = AbstractC6914e.purchase(audioTrack);
                    C0086e c0086e = new C0086e(purchase != null ? new C1703e(purchase) : C2406e.ad, 0L, null, false, false, false, 126);
                    this.f2828e = 1;
                    Object advert = AbstractC5336e.advert(AbstractC6731e.ad, new C6046e(c0086e, c18231e, (InterfaceC5083e) null, 1), this);
                    Object obj2 = EnumC2821e.f6782e;
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
                c1718e2.m680import();
                return Unit.INSTANCE;
        }
    }
}
