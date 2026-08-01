package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۦٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8353e extends AbstractC17416e {
    public static final C7936e appmetrica;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        appmetrica = new C7936e(2);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [eٌؘؒ, eٍُٝ] */
    public static C12671e appmetrica(FileChannel fileChannel, String str) {
        C0320e c0320e = new C0320e();
        C12671e c12671e = new C12671e();
        C4965e.ad(fileChannel, c0320e, str);
        while (fileChannel.position() < fileChannel.size()) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            appmetrica.getClass();
            int i = C1724e.ad;
            C18524e c18524e = new C18524e(ByteOrder.BIG_ENDIAN);
            c18524e.appmetrica(fileChannel);
            long position = fileChannel.position();
            EnumC13453e ad = EnumC13453e.ad((String) c18524e.f36317e);
            ArrayList arrayList = c12671e.f25403e;
            if (ad != null && ad == EnumC13453e.TAG) {
                ByteBuffer metrica = AbstractC17416e.metrica(fileChannel, c18524e);
                arrayList.add(new C15116e((String) c18524e.f36317e, c18524e.f36319e, c18524e.f36318e));
                if (c12671e.f25402e == null) {
                    ?? abstractC11130e = new AbstractC11130e(metrica, c18524e, 7);
                    abstractC11130e.f11501e = c12671e;
                    abstractC11130e.mo741e();
                    c12671e.f25400e = true;
                    c12671e.f25402e.f21996e = Long.valueOf(position);
                    c12671e.f25402e.f21997e = Long.valueOf(fileChannel.position());
                } else {
                    EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                }
            } else if (ad != null && ad == EnumC13453e.CORRUPT_TAG_LATE) {
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                if (c12671e.f25402e == null) {
                    c12671e.f25401e = true;
                }
                fileChannel.position(fileChannel.position() - 9);
            } else if (ad == null || ad != EnumC13453e.CORRUPT_TAG_EARLY) {
                arrayList.add(new C15116e((String) c18524e.f36317e, c18524e.f36319e, c18524e.f36318e));
                fileChannel.position(fileChannel.position() + c18524e.f36318e);
            } else {
                EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                if (c12671e.f25402e == null) {
                    c12671e.f25401e = true;
                }
                fileChannel.position(fileChannel.position() - 7);
            }
            AbstractC3395e.ad(fileChannel, c18524e);
        }
        if (c12671e.f25402e == null) {
            c12671e.f25402e = C12927e.metrica();
        }
        return c12671e;
    }
}
