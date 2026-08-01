package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: eؙؓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1641e extends AbstractC12696e {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    public static final String Signature(File file, File file2) {
        C1960e loadAd = loadAd(AbstractC12696e.billing(file));
        ?? r1 = loadAd.vip;
        C1960e loadAd2 = loadAd(AbstractC12696e.billing(file2));
        ?? r3 = loadAd2.vip;
        boolean equals = loadAd.ad.equals(loadAd2.ad);
        String str = null;
        if (equals) {
            int size = r3.size();
            int size2 = r1.size();
            int min = Math.min(size2, size);
            int i = 0;
            while (i < min && AbstractC7890e.billing(r1.get(i), r3.get(i))) {
                i++;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = size - 1;
            if (i <= i2) {
                while (!AbstractC7890e.billing(((File) r3.get(i2)).getName(), "..")) {
                    sb.append("..");
                    if (i2 != i) {
                        sb.append(File.separatorChar);
                    }
                    if (i2 != i) {
                        i2--;
                    }
                }
            }
            if (i < size2) {
                if (i < size) {
                    sb.append(File.separatorChar);
                }
                AbstractC13480e.m3610while(AbstractC13480e.subs(i, (List) r1), sb, File.separator, null, null, null, 124);
            }
            str = sb.toString();
        }
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    public static void admob(File file, String str) {
        Charset charset = AbstractC5508e.ad;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            subscription(fileOutputStream, str, charset);
            Unit unit = Unit.INSTANCE;
            fileOutputStream.close();
        } finally {
        }
    }

    public static void advert(File file, File file2) {
        if (!file.exists()) {
            throw new C17690e(file, 2);
        }
        if (file2.exists() && !file2.delete()) {
            throw new C13593e(file, file2, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C13593e(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[8192];
                for (int read = fileInputStream.read(bArr); read >= 0; read = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, read);
                }
                Unit unit = Unit.INSTANCE;
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC16704e.vip(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static void amazon(File file, Function1 function1) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), AbstractC5508e.ad));
        try {
            Iterator it = new C15006e(new C1356e(2, bufferedReader)).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            Unit unit = Unit.INSTANCE;
            bufferedReader.close();
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List, java.lang.Object] */
    public static final C1960e loadAd(C1960e c1960e) {
        File file = c1960e.ad;
        ?? r6 = c1960e.vip;
        ArrayList arrayList = new ArrayList(r6.size());
        for (File file2 : r6) {
            String name = file2.getName();
            if (AbstractC7890e.billing(name, ".")) {
                Unit unit = Unit.INSTANCE;
            } else if (!AbstractC7890e.billing(name, "..")) {
                arrayList.add(file2);
            } else if (arrayList.isEmpty() || AbstractC7890e.billing(((File) AbstractC13480e.m3570break(arrayList)).getName(), "..")) {
                arrayList.add(file2);
            }
        }
        return new C1960e(file, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0023 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void mopub(java.io.File r8, java.io.File r9, kotlin.jvm.functions.Function2 r10) {
        /*
            boolean r0 = r8.exists()
            if (r0 != 0) goto L10
            eِ٘ r9 = new eِ٘
            r0 = 2
            r9.<init>(r8, r0)
            r10.invoke(r8, r9)
            return
        L10:
            eؔۡٙ r0 = new eؔۡٙ     // Catch: defpackage.C2568e -> La6
            r1 = 5
            r2 = 0
            r0.<init>(r10, r1, r2)     // Catch: defpackage.C2568e -> La6
            eٕٜٓ r1 = new eٕٜٓ     // Catch: defpackage.C2568e -> La6
            r2 = 1
            r3 = 1
            r1.<init>(r8, r3, r0, r2)     // Catch: defpackage.C2568e -> La6
            eٟٕ r0 = new eٟٕ     // Catch: defpackage.C2568e -> La6
            r0.<init>(r1)     // Catch: defpackage.C2568e -> La6
        L23:
            boolean r1 = r0.hasNext()     // Catch: defpackage.C2568e -> La6
            if (r1 == 0) goto La6
            java.lang.Object r1 = r0.next()     // Catch: defpackage.C2568e -> La6
            java.io.File r1 = (java.io.File) r1     // Catch: defpackage.C2568e -> La6
            boolean r2 = r1.exists()     // Catch: defpackage.C2568e -> La6
            eؘؚۗ r3 = defpackage.EnumC7377e.f15118e
            if (r2 != 0) goto L44
            eِ٘ r2 = new eِ٘     // Catch: defpackage.C2568e -> La6
            r4 = 2
            r2.<init>(r1, r4)     // Catch: defpackage.C2568e -> La6
            java.lang.Object r1 = r10.invoke(r1, r2)     // Catch: defpackage.C2568e -> La6
            if (r1 != r3) goto L23
            goto La6
        L44:
            java.lang.String r2 = Signature(r1, r8)     // Catch: defpackage.C2568e -> La6
            java.io.File r4 = new java.io.File     // Catch: defpackage.C2568e -> La6
            r4.<init>(r9, r2)     // Catch: defpackage.C2568e -> La6
            boolean r2 = r4.exists()     // Catch: defpackage.C2568e -> La6
            if (r2 == 0) goto L80
            boolean r2 = r1.isDirectory()     // Catch: defpackage.C2568e -> La6
            if (r2 == 0) goto L5f
            boolean r2 = r4.isDirectory()     // Catch: defpackage.C2568e -> La6
            if (r2 != 0) goto L80
        L5f:
            boolean r2 = r4.isDirectory()     // Catch: defpackage.C2568e -> La6
            if (r2 == 0) goto L6c
            boolean r2 = smaato(r4)     // Catch: defpackage.C2568e -> La6
            if (r2 != 0) goto L80
            goto L72
        L6c:
            boolean r2 = r4.delete()     // Catch: defpackage.C2568e -> La6
            if (r2 != 0) goto L80
        L72:
            eِ٘ r2 = new eِ٘     // Catch: defpackage.C2568e -> La6
            java.lang.String r5 = "The destination file already exists."
            r2.<init>(r1, r4, r5)     // Catch: defpackage.C2568e -> La6
            java.lang.Object r1 = r10.invoke(r4, r2)     // Catch: defpackage.C2568e -> La6
            if (r1 != r3) goto L23
            goto La6
        L80:
            boolean r2 = r1.isDirectory()     // Catch: defpackage.C2568e -> La6
            if (r2 == 0) goto L8a
            r4.mkdirs()     // Catch: defpackage.C2568e -> La6
            goto L23
        L8a:
            advert(r1, r4)     // Catch: defpackage.C2568e -> La6
            long r4 = r4.length()     // Catch: defpackage.C2568e -> La6
            long r6 = r1.length()     // Catch: defpackage.C2568e -> La6
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L23
            java.io.IOException r2 = new java.io.IOException     // Catch: defpackage.C2568e -> La6
            java.lang.String r4 = "Source file wasn't copied completely, length of destination file differs."
            r2.<init>(r4)     // Catch: defpackage.C2568e -> La6
            java.lang.Object r1 = r10.invoke(r1, r2)     // Catch: defpackage.C2568e -> La6
            if (r1 != r3) goto L23
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1641e.mopub(java.io.File, java.io.File, kotlin.jvm.functions.Function2):void");
    }

    public static boolean smaato(File file) {
        C18278e c18278e = new C18278e(new C15453e(file, 2, null, 1));
        while (true) {
            boolean z = true;
            while (c18278e.hasNext()) {
                File file2 = (File) c18278e.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static final void subscription(FileOutputStream fileOutputStream, String str, Charset charset) {
        if (str.length() < 16384) {
            fileOutputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i2, str.length() - i);
            int i3 = i + min;
            str.getChars(i, i3, allocate.array(), i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (!onUnmappableCharacter.encode(allocate, allocate2, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(allocate2.array(), 0, allocate2.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i2 = 0;
            }
            allocate.clear();
            allocate2.clear();
            i = i3;
        }
    }
}
