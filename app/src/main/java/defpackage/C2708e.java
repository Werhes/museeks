package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٛۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2708e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f6583e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f6584e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6585e;

    public /* synthetic */ C2708e(Object obj, Object obj2, int i) {
        this.f6585e = i;
        this.f6584e = obj;
        this.f6583e = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6585e) {
            case 0:
                C13679e c13679e = (C13679e) this.f6584e;
                UmaTrack umaTrack = (UmaTrack) this.f6583e;
                AppActivity appActivity = (AppActivity) c13679e.pro();
                C8211e c8211e = new C8211e((List) c13679e.f27101e.getValue());
                String str = umaTrack.ad;
                AbstractC13201e.metrica(appActivity, c8211e, new C0086e(str != null ? new C1703e(str) : C2406e.ad, 0L, null, false, false, false, 126));
                return Unit.INSTANCE;
            default:
                return new C3646e(((C9252e) this.f6584e).ad, (C3825e) this.f6583e);
        }
    }
}
