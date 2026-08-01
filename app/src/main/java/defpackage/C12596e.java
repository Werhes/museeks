package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12596e implements Function2 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15876e f25311e;

    public C12596e(AbstractC15876e abstractC15876e) {
        this.f25311e = abstractC15876e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2 = (String) obj;
        AudioStreamMix audioStreamMix = (AudioStreamMix) obj2;
        AudioStreamMix.Link link = audioStreamMix.license;
        if (link == null || (str = link.vip) == null) {
            str = audioStreamMix.vip;
        }
        this.f25311e.amazon(new C18010e(6, str2, null, str, null));
        return Unit.INSTANCE;
    }
}
