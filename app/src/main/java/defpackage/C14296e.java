package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۠ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14296e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f28274e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C2038e f28275e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f28276e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14296e(C2038e c2038e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f28274e = i;
        this.f28275e = c2038e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f28274e) {
            case 0:
                return new C14296e(this.f28275e, interfaceC5083e, 0);
            case 1:
                return new C14296e(this.f28275e, interfaceC5083e, 1);
            default:
                return new C14296e(this.f28275e, interfaceC5083e, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f28274e) {
            case 0:
                return ((C14296e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C14296e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C14296e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f28274e;
        InterfaceC5083e interfaceC5083e = null;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        C2038e c2038e = this.f28275e;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.f28276e;
                if (i3 == 0) {
                    AbstractC2003e.purchase(obj);
                    C16251e c16251e = C16251e.ad;
                    if (!C16251e.metrica(EnumC14893e.f29512e)) {
                        C6540e c6540e = c2038e.mopub;
                        this.f28276e = 1;
                        if (c6540e.metrica(EnumC6955e.f14256e, this) == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i4 = this.f28276e;
                if (i4 == 0) {
                    AbstractC2003e.purchase(obj);
                    String str = ((UmaTrack) c2038e.adcel().vip).pro;
                    if (str == null) {
                        return Unit.INSTANCE;
                    }
                    C13029e c13029e = new C13029e(new String[]{str});
                    this.f28276e = 1;
                    obj = AbstractC18406e.yandex(c13029e, this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                AudioTrack audioTrack = (AudioTrack) AbstractC13480e.m3604this((List) obj);
                if (audioTrack != null) {
                    C15420e c15420e = AbstractC6731e.ad;
                    C12940e c12940e = AbstractC1497e.ad;
                    C0770e c0770e = new C0770e(c2038e, audioTrack, interfaceC5083e, 0);
                    this.f28276e = 2;
                    if (AbstractC5336e.advert(c12940e, c0770e, this) == enumC2821e) {
                        return enumC2821e;
                    }
                }
                return Unit.INSTANCE;
            default:
                int i5 = this.f28276e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    String str2 = ((UmaTrack) c2038e.adcel().vip).pro;
                    if (str2 == null) {
                        return Unit.INSTANCE;
                    }
                    C13029e c13029e2 = new C13029e(new String[]{str2});
                    this.f28276e = 1;
                    obj = AbstractC18406e.yandex(c13029e2, this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj);
                        return Unit.INSTANCE;
                    }
                    AbstractC2003e.purchase(obj);
                }
                AudioTrack audioTrack2 = (AudioTrack) AbstractC13480e.m3604this((List) obj);
                if (audioTrack2 != null) {
                    C15420e c15420e2 = AbstractC6731e.ad;
                    C12940e c12940e2 = AbstractC1497e.ad;
                    C0770e c0770e2 = new C0770e(c2038e, audioTrack2, interfaceC5083e, i2);
                    this.f28276e = 2;
                    if (AbstractC5336e.advert(c12940e2, c0770e2, this) == enumC2821e) {
                        return enumC2821e;
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
