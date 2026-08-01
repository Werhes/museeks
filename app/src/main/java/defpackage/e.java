package defpackage;

import android.os.Bundle;
import android.os.SharedMemory;
import android.system.OsConstants;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑ, reason: invalid class name */
/* loaded from: classes.dex */
public final class e {
    public final SharedMemory ad;

    public e(SharedMemory sharedMemory) {
        this.ad = sharedMemory;
    }

    public static e ad(byte[] bArr) {
        SharedMemory sharedMemory;
        try {
            sharedMemory = SharedMemory.create("BundleableByteArray", bArr.length);
        } catch (Exception e) {
            e = e;
            sharedMemory = null;
        }
        try {
            ByteBuffer mapReadWrite = sharedMemory.mapReadWrite();
            mapReadWrite.put(bArr);
            SharedMemory.unmap(mapReadWrite);
            sharedMemory.setProtect(OsConstants.PROT_READ);
            return new e(sharedMemory);
        } catch (Exception e2) {
            e = e2;
            AbstractC2803e.amazon("BundleableByteArray", "Failed to allocate shared memory for byte array, size=" + bArr.length, e);
            if (sharedMemory != null) {
                sharedMemory.close();
            }
            return null;
        }
    }

    public static byte[] vip(Bundle bundle) {
        ByteBuffer byteBuffer;
        SharedMemory sharedMemory = (SharedMemory) bundle.getParcelable(C18080e.purchase);
        try {
            if (sharedMemory == null) {
                return null;
            }
            try {
                byteBuffer = sharedMemory.mapReadOnly();
                try {
                    byte[] bArr = new byte[sharedMemory.getSize()];
                    byteBuffer.get(bArr);
                    SharedMemory.unmap(byteBuffer);
                    sharedMemory.close();
                    return bArr;
                } catch (Exception e) {
                    e = e;
                    AbstractC2803e.amazon("BundleableByteArray", "Failed to read byte array from shared memory", e);
                    if (byteBuffer != null) {
                        SharedMemory.unmap(byteBuffer);
                    }
                    sharedMemory.close();
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                byteBuffer = null;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    SharedMemory.unmap(null);
                }
                sharedMemory.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
