package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۧۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7622e {
    public static void Signature(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }

    public static MediaDescription ad(MediaDescription.Builder builder) {
        return builder.build();
    }

    public static void adcel(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    public static void advert(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    public static void amazon(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    public static Bitmap appmetrica(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    public static String billing(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    public static Bundle license(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    public static void loadAd(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static CharSequence metrica(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    public static void mopub(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static Uri purchase(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    public static void smaato(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    public static CharSequence startapp(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    public static MediaDescription.Builder vip() {
        return new MediaDescription.Builder();
    }

    public static CharSequence yandex(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }
}
