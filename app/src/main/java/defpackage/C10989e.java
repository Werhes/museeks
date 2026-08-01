package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10989e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ MainArtist f21749e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21750e;

    public /* synthetic */ C10989e(MainArtist mainArtist, int i) {
        this.f21750e = i;
        this.f21749e = mainArtist;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Activity activity = (Activity) obj;
        switch (this.f21750e) {
            case 0:
                AppActivity appActivity = (AppActivity) activity;
                String str = this.f21749e.ad;
                if (str == null) {
                    return Unit.INSTANCE;
                }
                appActivity.isVip(new C5522e(str));
                return Unit.INSTANCE;
            default:
                AppActivity appActivity2 = (AppActivity) activity;
                String str2 = this.f21749e.ad;
                if (str2 == null) {
                    return Unit.INSTANCE;
                }
                appActivity2.isVip(new C5522e(str2));
                return Unit.INSTANCE;
        }
    }
}
