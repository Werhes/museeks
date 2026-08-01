package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C18511e extends AbstractC11062e {
    /* renamed from: catch, reason: not valid java name */
    public static ArrayList m4563catch(C10675e c10675e, boolean z) {
        File file = c10675e.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                arrayList.add(c10675e.appmetrica(str));
            }
            AbstractC5167e.pro(arrayList);
            return arrayList;
        }
        if (!z) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + c10675e);
        }
        throw new FileNotFoundException("no such file: " + c10675e);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, eًؓٛ] */
    @Override // defpackage.AbstractC11062e
    public final InterfaceC0274e ad(C10675e c10675e) {
        return new C4122e(new FileOutputStream(c10675e.toFile(), true), new Object());
    }

    @Override // defpackage.AbstractC11062e
    public final List ads(C10675e c10675e) {
        return m4563catch(c10675e, false);
    }

    @Override // defpackage.AbstractC11062e
    public final void advert(C10675e c10675e) {
        if (c10675e.toFile().mkdir()) {
            return;
        }
        C15308e mo1917goto = mo1917goto(c10675e);
        if (mo1917goto == null || !mo1917goto.vip) {
            throw new IOException("failed to create directory: " + c10675e);
        }
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: break */
    public final InterfaceC0274e mo1914break(C10675e c10675e, boolean z) {
        if (!z || !isVip(c10675e)) {
            return AbstractC8636e.license(c10675e.toFile());
        }
        throw new IOException(c10675e + " already exists.");
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: extends */
    public final C0058e mo1916extends(C10675e c10675e) {
        return new C0058e(false, new RandomAccessFile(c10675e.toFile(), "r"));
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: goto */
    public C15308e mo1917goto(C10675e c10675e) {
        File file = c10675e.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || file.exists()) {
            return new C15308e(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
        }
        return null;
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: implements */
    public final InterfaceC2537e mo1918implements(C10675e c10675e) {
        return new C5476e(new FileInputStream(c10675e.toFile()), C1930e.license);
    }

    @Override // defpackage.AbstractC11062e
    public final List inmobi(C10675e c10675e) {
        return m4563catch(c10675e, true);
    }

    @Override // defpackage.AbstractC11062e
    public void license(C10675e c10675e, C10675e c10675e2) {
        if (c10675e.toFile().renameTo(c10675e2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + c10675e + " to " + c10675e2);
    }

    @Override // defpackage.AbstractC11062e
    public final void loadAd(C10675e c10675e, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = c10675e.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + c10675e);
        }
        if (z) {
            throw new FileNotFoundException("no such file: " + c10675e);
        }
    }

    @Override // defpackage.AbstractC11062e
    /* renamed from: protected */
    public final C0058e mo1919protected(C10675e c10675e) {
        return new C0058e(true, new RandomAccessFile(c10675e.toFile(), "rw"));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
