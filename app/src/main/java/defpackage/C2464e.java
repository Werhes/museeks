package defpackage;

import android.os.Build;
import java.util.Collections;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2464e extends AbstractC17880e {
    public static final C2464e appmetrica = new AbstractC17880e(DedicatedCacheService.class);

    public static void metrica(AppActivity appActivity, AbstractC3002e abstractC3002e) {
        C2177e c2177e = new C2177e(abstractC3002e, 1);
        if (appActivity == null) {
            c2177e.invoke();
        } else if (Build.VERSION.SDK_INT >= 33) {
            appActivity.premium(Collections.singletonList("android.permission.POST_NOTIFICATIONS"), new C6868e(c2177e, appActivity, 1));
        } else {
            c2177e.invoke();
        }
    }

    public static void vip(AppActivity appActivity, AudioTrack audioTrack) {
        C1708e c1708e = new C1708e(appActivity, audioTrack, 14);
        if (appActivity == null) {
            c1708e.invoke();
        } else if (Build.VERSION.SDK_INT >= 33) {
            appActivity.premium(Collections.singletonList("android.permission.POST_NOTIFICATIONS"), new C6868e(c1708e, appActivity, 1));
        } else {
            c1708e.invoke();
        }
    }
}
