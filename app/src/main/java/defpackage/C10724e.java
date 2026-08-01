package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؑٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10724e {
    public static final C7936e Signature;
    public final C12669e ad;
    public final ByteBuffer amazon;
    public C12669e appmetrica;
    public C12669e billing;
    public C12669e license;
    public final C18529e loadAd;
    public final C12669e metrica;
    public C12669e purchase;
    public final C12669e vip;
    public C12669e yandex;
    public final ArrayList startapp = new ArrayList();
    public final ArrayList adcel = new ArrayList();
    public final ArrayList mopub = new ArrayList();
    public final ArrayList advert = new ArrayList();
    public final ArrayList smaato = new ArrayList();

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        Signature = new C7936e(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0165, code lost:
    
        if (r10.metrica == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0167, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016d, code lost:
    
        throw new java.lang.Exception("Unable to determine start of audio in file");
     */
    /* JADX WARN: Type inference failed for: r2v5, types: [eۨؕ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [eۨؕ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10724e(java.io.RandomAccessFile r11) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10724e.<init>(java.io.RandomAccessFile):void");
    }

    public static C18529e vip(C12669e c12669e) {
        if (c12669e == null) {
            return null;
        }
        return (C18529e) c12669e.f25396e;
    }

    /* JADX WARN: Type inference failed for: r11v15, types: [eؘؚْ, java.lang.Object, eٍُٝ] */
    /* JADX WARN: Type inference failed for: r5v9, types: [eۨؕ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r9v1, types: [eۨؕ, java.lang.Object] */
    public final void ad(ByteBuffer byteBuffer, C12669e c12669e) {
        C18529e c18529e;
        C18529e c18529e2 = (C18529e) c12669e.f25396e;
        int position = byteBuffer.position();
        String str = c18529e2.ad;
        EnumC14671e enumC14671e = EnumC14671e.UNKNOWN;
        ?? r7 = 0;
        if (str.equals("meta")) {
            byte[] bArr = new byte[4];
            byteBuffer.get(bArr);
            try {
                if (bArr[0] != 0) {
                    throw new Exception("Expect data in meta box to be null");
                }
                try {
                    new Object().purchase(byteBuffer);
                } catch (C3830e unused) {
                    byteBuffer.position(byteBuffer.position() - 4);
                }
            } finally {
                byteBuffer.position(byteBuffer.position() - 8);
            }
        }
        int position2 = byteBuffer.position();
        while (byteBuffer.position() < (c18529e2.ad() + position2) - 8) {
            ?? obj = new Object();
            obj.purchase(byteBuffer);
            obj.metrica = this.loadAd.metrica + byteBuffer.position();
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            Signature.getClass();
            int i = C1724e.ad;
            C12669e c12669e2 = new C12669e(obj);
            c12669e.ad(c12669e2);
            String str2 = obj.ad;
            EnumC14671e enumC14671e2 = EnumC14671e.UNKNOWN;
            if (str2.equals("udta")) {
                this.billing = c12669e2;
            } else if (obj.ad.equals("meta") && c18529e2.ad.equals("udta")) {
                this.appmetrica = c12669e2;
            } else if (obj.ad.equals("hdlr") && c18529e2.ad.equals("meta")) {
                this.yandex = c12669e2;
            } else if (!obj.ad.equals("hdlr")) {
                if (obj.ad.equals("tags")) {
                    this.purchase = c12669e2;
                } else if (obj.ad.equals("stco")) {
                    ?? abstractC11130e = new AbstractC11130e(r7, r7);
                    abstractC11130e.f22047e = obj;
                    ByteBuffer slice = byteBuffer.slice();
                    abstractC11130e.f22046e = slice;
                    slice.order(ByteOrder.BIG_ENDIAN);
                    ByteBuffer byteBuffer2 = (ByteBuffer) abstractC11130e.f22046e;
                    byteBuffer2.position(byteBuffer2.position() + 4);
                    abstractC11130e.f14260e = ((ByteBuffer) abstractC11130e.f22046e).getInt();
                    abstractC11130e.f14259e = ((ByteBuffer) abstractC11130e.f22046e).getInt();
                    this.smaato.add(abstractC11130e);
                    this.startapp.add(c12669e2);
                } else if (obj.ad.equals("ilst")) {
                    C12669e c12669e3 = c12669e.f25399e;
                    if (c12669e3 != null && (c18529e = (C18529e) c12669e3.f25396e) != null && c18529e2.ad.equals("meta") && c18529e.ad.equals("udta")) {
                        this.license = c12669e2;
                    }
                } else if (obj.ad.equals("free")) {
                    this.adcel.add(c12669e2);
                } else if (obj.ad.equals("trak")) {
                    this.advert.add(c12669e2);
                }
            }
            if (obj.ad.equals("trak") || obj.ad.equals("mdia") || obj.ad.equals("minf") || obj.ad.equals("stbl") || obj.ad.equals("udta") || obj.ad.equals("meta") || obj.ad.equals("ilst")) {
                ad(byteBuffer, c12669e2);
            }
            byteBuffer.position(obj.ad() + byteBuffer.position());
            r7 = 0;
        }
        byteBuffer.position(position);
    }
}
