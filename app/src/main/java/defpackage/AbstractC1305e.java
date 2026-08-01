package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؒۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1305e {
    public static final C7936e vip;
    public InterfaceC17273e ad = C13784e.ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        vip = new C7936e(2);
    }

    public static void metrica(File file, File file2, RandomAccessFile randomAccessFile, FileChannel fileChannel) {
        C7936e c7936e = vip;
        try {
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                long size = channel.size();
                long j = 0;
                while (j < size) {
                    FileChannel fileChannel2 = fileChannel;
                    j += channel.transferTo(j, 1048576L, fileChannel2);
                    fileChannel = fileChannel2;
                }
                randomAccessFile.setLength(size);
                channel.close();
                if (!file.exists() || file.delete()) {
                    return;
                }
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                c7936e.getClass();
                int i = C1724e.ad;
            } finally {
            }
        } catch (FileNotFoundException e) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
            throw new C9163e(e, "New file %s does not exist", file);
        } catch (IOException e2) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i3 = C1724e.ad;
            throw new C9163e(e2, "Cannot make changes to file %s because unable to rename from temporary file %s", file2, file);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x011f A[Catch: Exception -> 0x0184, TryCatch #13 {Exception -> 0x0184, blocks: (B:84:0x011a, B:56:0x011f, B:57:0x0122, B:60:0x012c, B:62:0x0132, B:64:0x0150, B:65:0x0162, B:78:0x0163, B:79:0x0175, B:80:0x0176, B:82:0x017c), top: B:83:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c A[Catch: Exception -> 0x0184, TRY_LEAVE, TryCatch #13 {Exception -> 0x0184, blocks: (B:84:0x011a, B:56:0x011f, B:57:0x0122, B:60:0x012c, B:62:0x0132, B:64:0x0150, B:65:0x0162, B:78:0x0163, B:79:0x0175, B:80:0x0176, B:82:0x017c), top: B:83:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ad(defpackage.C0887e r18) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1305e.ad(eؘؒۥ):void");
    }

    public abstract void appmetrica(InterfaceC1425e interfaceC1425e, RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2);

    public void license(C0887e c0887e) {
        File createTempFile;
        FileLock tryLock;
        File file = c0887e.ad;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = vip;
        c7936e.getClass();
        int i = C1724e.ad;
        AbstractC9621e ad = AbstractC9621e.ad(c0887e.metrica);
        C8299e c8299e = C8299e.f16975e;
        InterfaceC9354e interfaceC9354e = (InterfaceC9354e) ad.appmetrica(c8299e);
        if (interfaceC9354e == c8299e) {
            throw new Exception("Null tag");
        }
        if (interfaceC9354e.isEmpty()) {
            ad(c0887e);
        } else {
            C12927e.license();
            if (file.length() <= 100) {
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                c7936e.getClass();
                throw new C9163e("Cannot make changes to file %s because too small to be an audio file", file);
            }
        }
        if (c0887e instanceof C7737e) {
            c0887e.vip();
            return;
        }
        try {
            createTempFile = File.createTempFile(file.getName().replace('.', '_'), ".tmp", file.getParentFile());
        } catch (IOException e) {
            if (!e.getMessage().equals("File name too long") || file.getName().length() <= 50) {
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i2 = C1724e.ad;
                throw new C9163e("Cannot modify %s because do not have permissions to create files in the folder", file);
            }
            try {
                createTempFile = File.createTempFile(file.getName().substring(0, 50).replace('.', '_'), ".tmp", file.getParentFile());
            } catch (IOException unused) {
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i3 = C1724e.ad;
                throw new C9163e("Cannot modify %s because do not have permissions to create files in the folder", file);
            }
        }
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(createTempFile, "rw");
            try {
                RandomAccessFile randomAccessFile3 = new RandomAccessFile(file, "rw");
                try {
                    try {
                        randomAccessFile3.seek(0L);
                        randomAccessFile2.seek(0L);
                        this.ad.ad(c0887e, false);
                        appmetrica(c0887e.metrica, randomAccessFile3, randomAccessFile2);
                        this.ad.metrica(c0887e, createTempFile);
                        try {
                            randomAccessFile3.close();
                            randomAccessFile2.close();
                        } catch (IOException unused2) {
                            EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                            c7936e.getClass();
                            int i4 = C1724e.ad;
                        }
                        if (createTempFile.length() > 0) {
                            if (C12927e.license().subscription) {
                                try {
                                    RandomAccessFile randomAccessFile4 = new RandomAccessFile(file, "rw");
                                    try {
                                        FileChannel channel = randomAccessFile4.getChannel();
                                        try {
                                            tryLock = channel.tryLock();
                                            try {
                                            } catch (Throwable th) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    if (tryLock != null) {
                                                        try {
                                                            tryLock.close();
                                                        } catch (Throwable th3) {
                                                            th.addSuppressed(th3);
                                                        }
                                                    }
                                                    throw th2;
                                                }
                                            }
                                        } catch (IOException e2) {
                                            EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
                                            c7936e.getClass();
                                            int i5 = C1724e.ad;
                                            if (!"Operation not supported".equals(e2.getMessage())) {
                                                throw new C9163e(e2, "Cannot make changes to file %s because it is being used by another application", file);
                                            }
                                            metrica(createTempFile, file, randomAccessFile4, channel);
                                        } catch (Exception e3) {
                                            EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
                                            c7936e.getClass();
                                            int i6 = C1724e.ad;
                                            throw new C9163e(e3, "Cannot make changes to file %s because it is being used by another application", file);
                                        }
                                        if (tryLock == null) {
                                            EnumC1005e[] enumC1005eArr8 = EnumC1005e.f3456e;
                                            c7936e.getClass();
                                            int i7 = C1724e.ad;
                                            throw new C9163e("Cannot make changes to file %s because it is being used by another application", file);
                                        }
                                        metrica(createTempFile, file, randomAccessFile4, channel);
                                        tryLock.close();
                                        randomAccessFile4.close();
                                    } catch (Throwable th4) {
                                        try {
                                            throw th4;
                                        } finally {
                                        }
                                    }
                                } catch (FileNotFoundException e4) {
                                    EnumC1005e[] enumC1005eArr9 = EnumC1005e.f3456e;
                                    c7936e.getClass();
                                    int i8 = C1724e.ad;
                                    throw new C9163e(e4, "Cannot make changes to file %s because the file cannot be found", file);
                                } catch (Exception e5) {
                                    EnumC1005e[] enumC1005eArr10 = EnumC1005e.f3456e;
                                    c7936e.getClass();
                                    int i9 = C1724e.ad;
                                    throw new C9163e(e5, "Cannot make changes to file %s", file);
                                }
                            } else {
                                File file2 = new File(file.getAbsoluteFile().getParentFile().getPath(), AbstractC16425e.appmetrica(file.getPath()) + ".old");
                                int i10 = 1;
                                while (file2.exists()) {
                                    file2 = new File(file.getAbsoluteFile().getParentFile().getPath(), AbstractC16425e.appmetrica(file.getPath()) + ".old" + i10);
                                    i10++;
                                }
                                if (!AbstractC1983e.amazon(file, file2)) {
                                    EnumC1005e[] enumC1005eArr11 = EnumC1005e.f3456e;
                                    c7936e.getClass();
                                    int i11 = C1724e.ad;
                                    createTempFile.delete();
                                    throw new C9163e("Cannot make changes to file %s because unable to rename the original file to %s", file, file2);
                                }
                                if (!AbstractC1983e.amazon(createTempFile, file)) {
                                    if (!createTempFile.exists()) {
                                        EnumC1005e[] enumC1005eArr12 = EnumC1005e.f3456e;
                                        c7936e.getClass();
                                        int i12 = C1724e.ad;
                                    }
                                    if (!file2.renameTo(file)) {
                                        EnumC1005e[] enumC1005eArr13 = EnumC1005e.f3456e;
                                        c7936e.getClass();
                                        int i13 = C1724e.ad;
                                    }
                                    EnumC1005e[] enumC1005eArr14 = EnumC1005e.f3456e;
                                    c7936e.getClass();
                                    int i14 = C1724e.ad;
                                    throw new C9163e("Cannot make changes to file %s because unable to rename from temporary file %s", file, createTempFile);
                                }
                                if (!file2.delete()) {
                                    EnumC1005e[] enumC1005eArr15 = EnumC1005e.f3456e;
                                    c7936e.getClass();
                                    int i15 = C1724e.ad;
                                }
                                if (createTempFile.exists() && !createTempFile.delete()) {
                                    EnumC1005e[] enumC1005eArr16 = EnumC1005e.f3456e;
                                    c7936e.getClass();
                                    int i16 = C1724e.ad;
                                }
                            }
                        } else if (!createTempFile.delete()) {
                            EnumC1005e[] enumC1005eArr17 = EnumC1005e.f3456e;
                            c7936e.getClass();
                            int i17 = C1724e.ad;
                        }
                        this.ad.vip(file);
                    } catch (Exception e6) {
                        EnumC1005e[] enumC1005eArr18 = EnumC1005e.f3456e;
                        c7936e.getClass();
                        int i18 = C1724e.ad;
                        try {
                            randomAccessFile3.close();
                            randomAccessFile2.close();
                        } catch (IOException unused3) {
                            EnumC1005e[] enumC1005eArr19 = EnumC1005e.f3456e;
                            c7936e.getClass();
                            int i19 = C1724e.ad;
                        }
                        if (!createTempFile.delete()) {
                            EnumC1005e[] enumC1005eArr20 = EnumC1005e.f3456e;
                            c7936e.getClass();
                        }
                        throw new C9163e("Cannot make changes to file %s", file, e6);
                    }
                } catch (Throwable th5) {
                    try {
                        randomAccessFile3.close();
                        randomAccessFile2.close();
                    } catch (IOException unused4) {
                        EnumC1005e[] enumC1005eArr21 = EnumC1005e.f3456e;
                        c7936e.getClass();
                        int i20 = C1724e.ad;
                    }
                    throw th5;
                }
            } catch (IOException unused5) {
                randomAccessFile = randomAccessFile2;
                EnumC1005e[] enumC1005eArr22 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i21 = C1724e.ad;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused6) {
                        EnumC1005e[] enumC1005eArr23 = EnumC1005e.f3456e;
                        c7936e.getClass();
                        int i22 = C1724e.ad;
                    }
                }
                if (!createTempFile.delete()) {
                    EnumC1005e[] enumC1005eArr24 = EnumC1005e.f3456e;
                    c7936e.getClass();
                    int i23 = C1724e.ad;
                }
                throw new C9163e("Cannot modify %s because do not have permissions to modify file", file);
            }
        } catch (IOException unused7) {
        }
    }

    public abstract void vip(RandomAccessFile randomAccessFile, RandomAccessFile randomAccessFile2);
}
