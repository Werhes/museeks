package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٙٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17831e extends AbstractC17555e {
    public static final C10744e metrica;
    public static final C7936e vip;

    /* JADX WARN: Type inference failed for: r1v6, types: [eٓؗ۠, eٌؙۘ] */
    /* JADX WARN: Type inference failed for: r3v2, types: [eٓؗ۠, eُؒٛ] */
    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        vip = new C7936e(2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC3291e.class);
        arrayList.add(AbstractC7168e.class);
        arrayList.add(AbstractC0156e.class);
        arrayList.add(AbstractC13214e.class);
        ?? abstractC13795e = new AbstractC13795e(arrayList, true);
        arrayList.add(AbstractC12359e.class);
        arrayList.add(AbstractC16725e.class);
        ?? abstractC13795e2 = new AbstractC13795e(arrayList, true);
        metrica = abstractC13795e2;
        abstractC13795e2.appmetrica(abstractC13795e);
    }

    @Override // defpackage.AbstractC17555e
    public final C0521e ad(RandomAccessFile randomAccessFile) {
        randomAccessFile.seek(0L);
        try {
            C7056e[] c7056eArr = C10744e.license;
            C7408e c7408e = new C7408e(new BufferedInputStream(new C7404e(randomAccessFile)));
            if (((C2637e) C10744e.appmetrica.vip(AbstractC12394e.license(c7408e), c7408e, 0L)).vip(C7056e.billing, AbstractC7687e.class) == null) {
                throw new Exception("Invalid ASF/WMA file. File header object not available.");
            }
            throw new ClassCastException();
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            if (e instanceof C1110e) {
                throw ((C1110e) e);
            }
            throw new Exception(AbstractC1786e.remoteconfig(e, new StringBuilder("Failed to read. Cause: ")), e);
        }
    }

    @Override // defpackage.AbstractC17555e
    public final C0887e metrica(File file, String str, boolean z) {
        C7408e c7408e = new C7408e(new BufferedInputStream(new FileInputStream(file)));
        try {
            if (((C2637e) metrica.vip(AbstractC12394e.license(c7408e), c7408e, 0L)).vip(C7056e.billing, AbstractC7687e.class) == null) {
                throw new C1110e("For file %s the File Header missing. Invalid ASF/WMA file.", file);
            }
            throw new ClassCastException();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c7408e.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // defpackage.AbstractC17555e
    public final InterfaceC1425e vip(RandomAccessFile randomAccessFile) {
        randomAccessFile.seek(0L);
        try {
            C7056e[] c7056eArr = C10744e.license;
            C7408e c7408e = new C7408e(new BufferedInputStream(new C7404e(randomAccessFile)));
            return AbstractC2413e.vip((C2637e) C10744e.purchase.vip(AbstractC12394e.license(c7408e), c7408e, 0L));
        } catch (RuntimeException e) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            vip.getClass();
            int i = C1724e.ad;
            throw new C1110e("Failed to read", e);
        }
    }
}
