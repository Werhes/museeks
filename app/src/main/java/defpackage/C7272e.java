package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٚۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7272e {
    public static final /* synthetic */ C7272e ad = new Object();
    public static final NativeSharedCounter vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚٚۙ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.datastore.core.NativeSharedCounter] */
    static {
        System.loadLibrary("datastore_shared_counter");
        vip = new Object();
    }

    public static C10520e ad(ParcelFileDescriptor parcelFileDescriptor) {
        NativeSharedCounter nativeSharedCounter = vip;
        if (nativeSharedCounter == null) {
            throw new IllegalStateException("DataStore failed to load the native library to create SharedCounter.");
        }
        int fd = parcelFileDescriptor.getFd();
        if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
            throw new IOException("Failed to truncate counter file");
        }
        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
        if (nativeCreateSharedCounter >= 0) {
            return new C10520e(nativeSharedCounter, nativeCreateSharedCounter);
        }
        throw new IOException("Failed to mmap counter file");
    }
}
