package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۘٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14930e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AudioStreamMix f29610e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ String f29611e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15876e f29612e;

    public C14930e(AbstractC15876e abstractC15876e, String str, AudioStreamMix audioStreamMix) {
        this.f29612e = abstractC15876e;
        this.f29611e = str;
        this.f29610e = audioStreamMix;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        AudioStreamMix audioStreamMix = this.f29610e;
        AudioStreamMix.Link link = audioStreamMix.license;
        if (link == null || (str = link.vip) == null) {
            str = audioStreamMix.vip;
        }
        this.f29612e.amazon(new C18010e(6, this.f29611e, null, str, null));
        return Unit.INSTANCE;
    }
}
