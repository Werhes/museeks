package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import java.io.IOException;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۨٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3785e {
    public static final LruCache ad = new LruCache(10);

    public static final MediaCodecInfo ad(String str) {
        Object obj;
        MediaCodec mediaCodec;
        LruCache lruCache = ad;
        synchronized (lruCache) {
            obj = lruCache.get(str);
            Unit unit = Unit.INSTANCE;
        }
        try {
            if (obj != null) {
                return (MediaCodecInfo) obj;
            }
            try {
                mediaCodec = MediaCodec.createEncoderByType(str);
                try {
                    MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                    synchronized (lruCache) {
                    }
                    mediaCodec.release();
                    return codecInfo;
                } catch (Throwable th) {
                    th = th;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new Exception(e);
            } catch (IllegalArgumentException e2) {
                throw new Exception(e2);
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCodec = null;
        }
    }
}
