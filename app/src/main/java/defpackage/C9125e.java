package defpackage;

import android.provider.MediaStore;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۦۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9125e extends AbstractC7919e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9125e(int i) {
        super(1, AbstractC12681e.vip(4) ? MediaStore.Audio.Albums.getContentUri("external") : MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album", "artist_id", "artist", "numsongs", "maxyear", "album_art"}, new C3114e(0));
        switch (i) {
            case 2:
                super(1, AbstractC12681e.vip(4) ? MediaStore.Audio.Media.getContentUri("external") : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "title", "duration", "album", "album_id", "artist", "artist_id", "_data"}, new C3114e(2));
                return;
            default:
                return;
        }
    }
}
