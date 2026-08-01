package defpackage;

import android.media.MediaDescription;
import android.net.Uri;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٝؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8824e {
    public static Uri ad(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    public static void vip(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
