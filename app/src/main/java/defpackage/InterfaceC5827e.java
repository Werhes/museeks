package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5827e {
    ByteBuffer Signature(int i);

    void ad(Bundle bundle);

    boolean adcel(C7988e c7988e);

    void admob(Surface surface);

    void advert(int i, long j);

    int amazon(MediaCodec.BufferInfo bufferInfo);

    void billing(int i);

    void flush();

    void loadAd(int i);

    void mopub();

    void pro(C6321e c6321e, Handler handler);

    void purchase(int i, int i2, int i3, long j);

    void release();

    void remoteconfig(ArrayList arrayList);

    void signatures(ArrayList arrayList);

    int smaato();

    MediaFormat startapp();

    ByteBuffer subscription(int i);

    void vip(int i, C0579e c0579e, long j, int i2);

    void yandex(RunnableC7410e runnableC7410e);
}
