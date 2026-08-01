package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4948e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14873e f10463e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10464e;

    public /* synthetic */ C4948e(C14873e c14873e, int i) {
        this.f10464e = i;
        this.f10463e = c14873e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AudioPlaylist audioPlaylist;
        switch (this.f10464e) {
            case 0:
                this.f10463e.f29459e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                C14873e.m3867continue(1, this.f10463e, null, false);
                return Unit.INSTANCE;
            case 2:
                C14873e.m3867continue(1, this.f10463e, null, true);
                return Unit.INSTANCE;
            case 3:
                this.f10463e.m3874e(false);
                return Unit.INSTANCE;
            case 4:
                this.f10463e.f29459e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 5:
                C14873e c14873e = this.f10463e;
                c14873e.f29459e.setValue(Boolean.FALSE);
                InterfaceC11578e m3875e = c14873e.m3875e();
                InterfaceC5083e interfaceC5083e = null;
                C6123e c6123e = m3875e instanceof C6123e ? (C6123e) m3875e : null;
                if (c6123e != null && (audioPlaylist = c6123e.ad) != null) {
                    AppActivity appActivity = (AppActivity) c14873e.pro();
                    AbstractC16519e.ad(AbstractC17947e.billing(appActivity), appActivity, true, new C8086e(audioPlaylist, c14873e, interfaceC5083e, 7));
                }
                return Unit.INSTANCE;
            default:
                this.f10463e.m3874e(true);
                return Unit.INSTANCE;
        }
    }
}
