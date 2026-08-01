package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘۠ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18058e {
    public static final C7936e vip;
    public C18334e ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        vip = new C7936e(2);
    }

    public static void ad(FileChannel fileChannel, FileChannel fileChannel2, int i, int i2) {
        int i3 = i - 8;
        C7936e c7936e = vip;
        if (i3 < i2) {
            if (i == i2) {
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                c7936e.getClass();
                int i4 = C1724e.ad;
                fileChannel.position(fileChannel.position() + i);
                return;
            }
            return;
        }
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c7936e.getClass();
        int i5 = C1724e.ad;
        C2587e c2587e = new C2587e(i3 - i2);
        fileChannel2.write(((C18529e) c2587e.f22047e).metrica());
        fileChannel2.write((ByteBuffer) c2587e.f22046e);
        fileChannel.position(fileChannel.position() + i);
    }

    public static void appmetrica(FileChannel fileChannel, FileChannel fileChannel2, C18529e c18529e) {
        if (c18529e == null) {
            purchase(fileChannel, fileChannel2);
            return;
        }
        long position = c18529e.metrica - fileChannel.position();
        fileChannel2.transferFrom(fileChannel, fileChannel2.position(), position);
        fileChannel2.position(fileChannel2.position() + position);
        C2587e c2587e = new C2587e(c18529e.ad());
        fileChannel2.write(((C18529e) c2587e.f22047e).metrica());
        fileChannel2.write((ByteBuffer) c2587e.f22046e);
        fileChannel.position(c18529e.vip());
        purchase(fileChannel, fileChannel2);
    }

    public static void billing(FileChannel fileChannel, FileChannel fileChannel2, C18529e c18529e, ByteBuffer byteBuffer) {
        fileChannel.position(0L);
        fileChannel2.transferFrom(fileChannel, 0L, c18529e.metrica);
        fileChannel2.position(c18529e.metrica);
        fileChannel2.write(byteBuffer);
        fileChannel.position(c18529e.vip());
    }

    public static boolean metrica(int i, boolean z, int i2, List list, C18529e c18529e, C18529e c18529e2) {
        if (c18529e2.metrica <= c18529e.metrica) {
            return false;
        }
        if (z && (i - 8 >= i2 || i == i2)) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C6962e) it.next()).m2263e(i2);
        }
        return true;
    }

    public static void purchase(FileChannel fileChannel, FileChannel fileChannel2) {
        long size = fileChannel.size() - fileChannel.position();
        long j = C12927e.license().admob;
        long j2 = size / j;
        long j3 = size % j;
        long j4 = 0;
        for (int i = 0; i < j2; i++) {
            j4 = fileChannel2.transferFrom(fileChannel, fileChannel2.position(), j) + j4;
            fileChannel2.position(fileChannel2.position() + j);
        }
        if (j3 > 0) {
            long transferFrom = fileChannel2.transferFrom(fileChannel, fileChannel2.position(), j3) + j4;
            if (transferFrom != size) {
                throw new Exception(AbstractC5087e.m1750native(transferFrom, " bytes", AbstractC1786e.inmobi(size, "Was meant to write ", " bytes but only written ")));
            }
        }
    }

    public static void vip(C18529e c18529e, ByteBuffer byteBuffer, int i, C18529e c18529e2, C18529e c18529e3) {
        c18529e.appmetrica(c18529e.vip + i);
        if (c18529e2 != null) {
            c18529e2.appmetrica(c18529e2.vip + i);
            byteBuffer.position((int) ((c18529e2.metrica - c18529e.metrica) - 8));
            byteBuffer.put(c18529e2.metrica());
        }
        if (c18529e3 != null) {
            c18529e3.appmetrica(c18529e3.vip + i);
            byteBuffer.position((int) ((c18529e3.metrica - c18529e.metrica) - 8));
            byteBuffer.put(c18529e3.metrica());
        }
    }

    public static void yandex(long j, FileChannel fileChannel, FileChannel fileChannel2, C18529e c18529e) {
        long position = c18529e.metrica - fileChannel.position();
        fileChannel2.transferFrom(fileChannel, fileChannel2.position(), position);
        fileChannel2.position(fileChannel2.position() + position);
        C2587e c2587e = new C2587e(c18529e.ad());
        fileChannel2.write(((C18529e) c2587e.f22047e).metrica());
        fileChannel2.write((ByteBuffer) c2587e.f22046e);
        fileChannel.position(c18529e.vip());
        fileChannel2.transferFrom(fileChannel, fileChannel2.position(), j - fileChannel.position());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:6|(5:(1:(1:(18:10|11|(2:12|(8:14|(1:16)(4:208|(1:210)(1:223)|211|(1:(2:214|(1:216)(3:217|218|219)))(3:220|221|222))|17|(2:(1:20)(3:26|(1:37)(1:30)|(3:34|35|36))|(3:22|23|24))|38|(1:40)(1:207)|(2:42|(2:44|(2:48|49))(1:205))(1:206)|203)(2:224|225))|50|(2:51|(3:53|(2:55|56)(2:198|199)|(2:58|59)(1:197))(2:200|201))|(2:61|(1:194)(12:63|64|(1:66)(3:143|(3:145|(1:147)(2:150|(1:152)(3:153|(3:155|(2:158|156)|159)|160))|148)(2:161|(1:163)(10:164|(4:166|(1:168)(1:172)|(1:170)|171)(2:173|(6:175|(1:177)|178|(1:180)(1:184)|(1:182)|183)(4:185|(1:187)(1:191)|(1:189)|190))|68|69|70|71|72|73|74|(2:76|(3:78|79|(2:81|(2:83|(5:85|(5:88|89|(4:91|92|93|(2:95|96)(3:98|99|100))(2:101|(1:106)(3:103|104|105))|97|86)|107|108|109)(3:111|112|113))(2:114|115))(2:116|117))(2:118|119))(2:120|121)))|149)|67|68|69|70|71|72|73|74|(0)(0)))(1:196)|195|64|(0)(0)|67|68|69|70|71|72|73|74|(0)(0))(2:226|(1:228)(1:232)))(20:233|230|231|11|(3:12|(0)(0)|203)|50|(3:51|(0)(0)|197)|(0)(0)|195|64|(0)(0)|67|68|69|70|71|72|73|74|(0)(0)))(2:234|(1:236)(19:237|231|11|(3:12|(0)(0)|203)|50|(3:51|(0)(0)|197)|(0)(0)|195|64|(0)(0)|67|68|69|70|71|72|73|74|(0)(0)))|72|73|74|(0)(0))|229|230|231|11|(3:12|(0)(0)|203)|50|(3:51|(0)(0)|197)|(0)(0)|195|64|(0)(0)|67|68|69|70|71) */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0621, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0622, code lost:
    
        r3 = r3;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x06b7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x06b2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x06b3, code lost:
    
        r3 = r33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x06a8 A[Catch: all -> 0x0621, Exception -> 0x0624, TryCatch #1 {all -> 0x0621, blocks: (B:93:0x05fc, B:95:0x0604, B:97:0x063b, B:99:0x0607, B:100:0x0620, B:124:0x06bc, B:126:0x06c0, B:127:0x06c2, B:128:0x06c3, B:129:0x06cd, B:101:0x0631, B:104:0x0641, B:105:0x0658, B:112:0x0669, B:113:0x068d, B:114:0x068e, B:115:0x0695, B:116:0x0696, B:117:0x069d, B:118:0x069e, B:119:0x06a7, B:120:0x06a8, B:121:0x06b1), top: B:69:0x0598 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x06c0 A[Catch: all -> 0x0621, TryCatch #1 {all -> 0x0621, blocks: (B:93:0x05fc, B:95:0x0604, B:97:0x063b, B:99:0x0607, B:100:0x0620, B:124:0x06bc, B:126:0x06c0, B:127:0x06c2, B:128:0x06c3, B:129:0x06cd, B:101:0x0631, B:104:0x0641, B:105:0x0658, B:112:0x0669, B:113:0x068d, B:114:0x068e, B:115:0x0695, B:116:0x0696, B:117:0x069d, B:118:0x069e, B:119:0x06a7, B:120:0x06a8, B:121:0x06b1), top: B:69:0x0598 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06c3 A[Catch: all -> 0x0621, TryCatch #1 {all -> 0x0621, blocks: (B:93:0x05fc, B:95:0x0604, B:97:0x063b, B:99:0x0607, B:100:0x0620, B:124:0x06bc, B:126:0x06c0, B:127:0x06c2, B:128:0x06c3, B:129:0x06cd, B:101:0x0631, B:104:0x0641, B:105:0x0658, B:112:0x0669, B:113:0x068d, B:114:0x068e, B:115:0x0695, B:116:0x0696, B:117:0x069d, B:118:0x069e, B:119:0x06a7, B:120:0x06a8, B:121:0x06b1), top: B:69:0x0598 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05a7 A[Catch: all -> 0x0627, Exception -> 0x062c, TryCatch #6 {Exception -> 0x062c, all -> 0x0627, blocks: (B:73:0x059c, B:76:0x05a7, B:78:0x05ad, B:81:0x05b7, B:83:0x05bf, B:86:0x05ce, B:88:0x05d4, B:91:0x05ed), top: B:72:0x059c }] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v2, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3, types: [eۨؕ] */
    /* JADX WARN: Type inference failed for: r18v4, types: [eۨؕ] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void license(defpackage.InterfaceC1425e r31, java.io.RandomAccessFile r32, java.io.RandomAccessFile r33) {
        /*
            Method dump skipped, instructions count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18058e.license(eۣؒ۟, java.io.RandomAccessFile, java.io.RandomAccessFile):void");
    }
}
