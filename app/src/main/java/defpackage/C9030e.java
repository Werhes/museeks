package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ۠ٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9030e {
    public final MediaCodec ad;
    public final C7169e appmetrica;
    public final C9689e license;
    public final ByteBuffer metrica;
    public final /* synthetic */ C18405e startapp;
    public final int vip;
    public final AtomicBoolean purchase = new AtomicBoolean(false);
    public long billing = 0;
    public boolean yandex = false;

    public C9030e(C18405e c18405e, MediaCodec mediaCodec, int i) {
        this.startapp = c18405e;
        mediaCodec.getClass();
        this.ad = mediaCodec;
        AbstractC4265e.purchase(i);
        this.vip = i;
        this.metrica = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.license = AbstractC5750e.purchase(new C17678e(atomicReference, 3));
        C7169e c7169e = (C7169e) atomicReference.get();
        c7169e.getClass();
        this.appmetrica = c7169e;
    }
}
