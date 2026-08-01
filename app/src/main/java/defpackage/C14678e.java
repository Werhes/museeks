package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14678e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C2014e f28925e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Context f28926e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28927e;

    public /* synthetic */ C14678e(Activity activity, C2014e c2014e, int i) {
        this.f28927e = i;
        this.f28926e = activity;
        this.f28925e = c2014e;
    }

    public /* synthetic */ C14678e(C2014e c2014e, Activity activity) {
        this.f28927e = 0;
        this.f28925e = c2014e;
        this.f28926e = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        switch (this.f28927e) {
            case 0:
                new C13182e(new C9369e(27), this.f28925e.f5297e, list, 8).signatures((Activity) this.f28926e);
                return Unit.INSTANCE;
            case 1:
                AbstractC2745e.vip(this.f28926e, new C1708e(this.f28925e.f5297e, list, 4));
                return Unit.INSTANCE;
            default:
                C11794e c11794e = C11794e.f23667e;
                AppActivity appActivity = (AppActivity) this.f28926e;
                C2014e c2014e = this.f28925e;
                String str = c2014e.f5296e;
                AudioPlaylist audioPlaylist = c2014e.f5297e;
                c11794e.getClass();
                C11794e.ad(appActivity, str, audioPlaylist, list);
                return Unit.INSTANCE;
        }
    }
}
