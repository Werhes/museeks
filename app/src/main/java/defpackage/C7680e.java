package defpackage;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7680e {
    public final int ad;
    public final long license;
    public final long metrica;
    public final int vip;

    public C7680e(int i, int i2, long j, long j2) {
        this.ad = i;
        this.vip = i2;
        this.metrica = j;
        this.license = j2;
    }

    public static C7680e ad(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C7680e c7680e = new C7680e(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c7680e;
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C7680e)) {
            C7680e c7680e = (C7680e) obj;
            if (this.vip == c7680e.vip && this.metrica == c7680e.metrica && this.ad == c7680e.ad && this.license == c7680e.license) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.vip), Long.valueOf(this.metrica), Integer.valueOf(this.ad), Long.valueOf(this.license));
    }

    public final void vip(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.ad);
            dataOutputStream.writeInt(this.vip);
            dataOutputStream.writeLong(this.metrica);
            dataOutputStream.writeLong(this.license);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
