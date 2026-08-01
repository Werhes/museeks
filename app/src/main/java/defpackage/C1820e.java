package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1820e implements Function3 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC15876e f4901e;

    public C1820e(AbstractC15876e abstractC15876e) {
        this.f4901e = abstractC15876e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        AudioStreamMix audioStreamMix = (AudioStreamMix) obj;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(audioStreamMix) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 19) != 18)) {
            AudioStreamMix.Link link = audioStreamMix.license;
            if (link == null || (str = link.ad) == null) {
                str = audioStreamMix.ad;
            }
            AbstractC15876e abstractC15876e = this.f4901e;
            int i = intValue & 14;
            boolean yandex = c13770e.yandex(abstractC15876e) | c13770e.purchase(str) | (i == 4);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C14930e(abstractC15876e, str, audioStreamMix);
                c13770e.m3682throws(m3681throw);
            }
            Function0 function0 = (Function0) m3681throw;
            boolean yandex2 = c13770e.yandex(abstractC15876e) | c13770e.purchase(str);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex2 || m3681throw2 == c5170e) {
                m3681throw2 = new C1021e(abstractC15876e, str, 3);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC12068e.ad(audioStreamMix, function0, (Function0) m3681throw2, c13770e, i);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
