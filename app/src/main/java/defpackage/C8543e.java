package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioFollowingsUpdateInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8543e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C3739e f17344e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AudioFollowingsUpdateInfo f17345e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C11204e f17346e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17347e;

    public /* synthetic */ C8543e(AudioFollowingsUpdateInfo audioFollowingsUpdateInfo, C3739e c3739e, C11204e c11204e, int i) {
        this.f17347e = i;
        this.f17345e = audioFollowingsUpdateInfo;
        this.f17344e = c3739e;
        this.f17346e = c11204e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f17347e;
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC6022e.vip(null, AbstractC16653e.license(534187657, new C8543e(this.f17345e, this.f17344e, this.f17346e, 1), c13770e), c13770e, 48, 1);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C3739e c3739e = this.f17344e;
                    boolean yandex = c13770e.yandex(c3739e);
                    C11204e c11204e = this.f17346e;
                    boolean yandex2 = yandex | c13770e.yandex(c11204e);
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex2 || m3681throw == C2987e.ad) {
                        m3681throw = new Celse(c3739e, c11204e, 12);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC10653e.ad(this.f17345e, (Function0) m3681throw, c13770e, 0);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
