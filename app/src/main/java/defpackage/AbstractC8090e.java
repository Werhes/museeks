package defpackage;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٞؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8090e {
    public static MediaSession.QueueItem ad(MediaDescription mediaDescription, long j) {
        return new MediaSession.QueueItem(mediaDescription, j);
    }

    public static long metrica(MediaSession.QueueItem queueItem) {
        return queueItem.getQueueId();
    }

    public static MediaDescription vip(MediaSession.QueueItem queueItem) {
        return queueItem.getDescription();
    }
}
