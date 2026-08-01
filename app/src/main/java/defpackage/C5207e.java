package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۡٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5207e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15293e f11109e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11110e;

    public /* synthetic */ C5207e(C15293e c15293e, int i) {
        this.f11110e = i;
        this.f11109e = c15293e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f11110e;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        C15293e c15293e = this.f11109e;
        switch (i) {
            case 0:
                C14501e c14501e = (C14501e) ((InterfaceC18018e) obj);
                c14501e.ad(R.string.action_audio_addtoplaylist, R.drawable.ic_list_add_outline_28, new C2946e(c15293e, i4));
                c14501e.ad(R.string.action_audio_playnext, R.drawable.ic_list_play_outline_28, new C2946e(c15293e, i2));
                c14501e.ad(R.string.action_audio_cache, R.drawable.ic_playlist_cached_36, new C2946e(c15293e, 3));
                c14501e.ad(R.string.action_audio_dl, R.drawable.ic_download_outline_28, new C2946e(c15293e, 4));
                if (((ArrayList) ((C12344e) c15293e.f30217e.f26730e).f24748e).size() <= 20) {
                    c14501e.ad(R.string.action_audio_remove, R.drawable.ic_delete_outline_android_28, new C2946e(c15293e, 5));
                }
                return Unit.INSTANCE;
            case 1:
                List list = (List) obj;
                C16985e c16985e = new C16985e(c15293e.pro());
                C11486e c11486e = (C11486e) c16985e.f26878e;
                c11486e.license = c11486e.ad.getText(R.string.confirm);
                VKXApplication vKXApplication = VKXApplication.f36528e;
                c11486e.purchase = (vKXApplication != null ? vKXApplication : null).getString(R.string.library_remove_multi_desc, Integer.valueOf(list.size()));
                c16985e.premium(R.string.remove, new DialogInterfaceOnClickListenerC1458e(c15293e, list, i4));
                c16985e.ads(R.string.cancel, new DialogInterfaceOnClickListenerC11813e(2));
                c16985e.isPro();
                return Unit.INSTANCE;
            case 2:
                int intValue = ((Integer) obj).intValue();
                C6977e c6977e = c15293e.f11121e;
                if (c6977e == null) {
                    c6977e = null;
                }
                if (c6977e.getCurrentItem() == intValue) {
                    Object obj2 = c15293e.f30219e.get(intValue);
                    InterfaceC17156e interfaceC17156e = obj2 instanceof InterfaceC17156e ? (InterfaceC17156e) obj2 : null;
                    if (interfaceC17156e != null) {
                        interfaceC17156e.smaato();
                    }
                } else {
                    C6977e c6977e2 = c15293e.f11121e;
                    (c6977e2 != null ? c6977e2 : null).setCurrentItem(intValue, true);
                }
                return Unit.INSTANCE;
            default:
                new C11467e((View) obj, new C5207e(c15293e, i3)).m3218this();
                return Unit.INSTANCE;
        }
    }
}
