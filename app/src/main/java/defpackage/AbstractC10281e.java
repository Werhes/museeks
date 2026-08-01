package defpackage;

import android.media.Rating;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10281e {
    public static float ad(Rating rating) {
        return rating.getPercentRating();
    }

    public static Rating adcel(boolean z) {
        return Rating.newThumbRating(z);
    }

    public static boolean appmetrica(Rating rating) {
        return rating.isRated();
    }

    public static Rating billing(boolean z) {
        return Rating.newHeartRating(z);
    }

    public static boolean license(Rating rating) {
        return rating.hasHeart();
    }

    public static float metrica(Rating rating) {
        return rating.getStarRating();
    }

    public static Rating mopub(int i) {
        return Rating.newUnratedRating(i);
    }

    public static boolean purchase(Rating rating) {
        return rating.isThumbUp();
    }

    public static Rating startapp(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    public static int vip(Rating rating) {
        return rating.getRatingStyle();
    }

    public static Rating yandex(float f) {
        return Rating.newPercentageRating(f);
    }
}
