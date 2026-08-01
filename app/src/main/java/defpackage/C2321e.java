package defpackage;

import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2321e {
    public static final C7936e vip;
    public final String ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        vip = new C7936e(2);
    }

    public C2321e(String str) {
        this.ad = str;
    }

    /* JADX WARN: Type inference failed for: r6v24, types: [eؕٙ۠, eٍُٝ] */
    public final C0829e ad(FileChannel fileChannel) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = vip;
        c7936e.getClass();
        int i = C1724e.ad;
        C0829e c0829e = new C0829e(C12927e.license().pro);
        boolean ad = AbstractC15365e.ad(fileChannel);
        String str = this.ad;
        if (!ad) {
            throw new Exception(AbstractC10257e.adcel(str, " Wav RIFF Header not valid"));
        }
        while (fileChannel.position() < fileChannel.size()) {
            C18524e c18524e = new C18524e(ByteOrder.LITTLE_ENDIAN);
            c18524e.appmetrica(fileChannel);
            String str2 = (String) c18524e.f36317e;
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            fileChannel.position();
            c7936e.getClass();
            int i2 = C1724e.ad;
            EnumC2113e ad2 = EnumC2113e.ad(str2);
            if (ad2 != null) {
                int ordinal = ad2.ordinal();
                int i3 = 1;
                ArrayList arrayList = c0829e.f3218e;
                if (ordinal == 3) {
                    arrayList.add(new C15116e((String) c18524e.f36317e, c18524e.f36319e, c18524e.f36318e));
                    if (c0829e.f3214e == null) {
                        C5957e c5957e = new C5957e(AbstractC1983e.startapp(fileChannel, (int) c18524e.f36318e), c18524e, i3);
                        c5957e.f12557e = c0829e;
                        c5957e.f12559e = str;
                        if (!c5957e.mo741e()) {
                            break;
                        }
                    } else {
                        EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                        AbstractC6069e.ad(c18524e.f36319e - 1);
                    }
                } else if (ordinal == 5) {
                    arrayList.add(new C15116e((String) c18524e.f36317e, c18524e.f36319e, c18524e.f36318e));
                    if (c0829e.f3220e == null) {
                        ?? abstractC11130e = new AbstractC11130e(AbstractC1983e.startapp(fileChannel, (int) c18524e.f36318e), c18524e, 7);
                        abstractC11130e.f7713e = c0829e;
                        if (!abstractC11130e.mo741e()) {
                            break;
                        }
                    } else {
                        EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                        AbstractC6069e.ad(c18524e.f36319e);
                    }
                } else if (ordinal == 6) {
                    EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                    if (c0829e.f3214e == null && c0829e.f3220e == null) {
                        c0829e.f3216e = true;
                    }
                    fileChannel.position(fileChannel.position() - 7);
                } else if (ordinal == 7) {
                    EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
                    if (c0829e.f3214e == null && c0829e.f3220e == null) {
                        c0829e.f3216e = true;
                    }
                    fileChannel.position(fileChannel.position() - 7);
                } else if (ordinal != 8) {
                    arrayList.add(new C15116e((String) c18524e.f36317e, c18524e.f36319e, c18524e.f36318e));
                    fileChannel.position(fileChannel.position() + c18524e.f36318e);
                } else {
                    EnumC1005e[] enumC1005eArr7 = EnumC1005e.f3456e;
                    if (c0829e.f3214e == null && c0829e.f3220e == null) {
                        c0829e.f3216e = true;
                    }
                    fileChannel.position(fileChannel.position() - 7);
                }
            } else {
                if (c18524e.f36318e < 0) {
                    StringBuilder isPro = AbstractC8703e.isPro(str, " Not a valid header, unable to read a sensible size:Header");
                    isPro.append((String) c18524e.f36317e);
                    isPro.append("Size:");
                    isPro.append(c18524e.f36318e);
                    String sb = isPro.toString();
                    EnumC1005e[] enumC1005eArr8 = EnumC1005e.f3456e;
                    throw new Exception(sb);
                }
                fileChannel.position(fileChannel.position() + c18524e.f36318e);
                if (fileChannel.position() > fileChannel.size()) {
                    StringBuilder isPro2 = AbstractC8703e.isPro(str, " Failed to move to invalid position to ");
                    isPro2.append(fileChannel.position());
                    isPro2.append(" because file length is only ");
                    isPro2.append(fileChannel.size());
                    isPro2.append(" indicates invalid chunk");
                    String sb2 = isPro2.toString();
                    EnumC1005e[] enumC1005eArr9 = EnumC1005e.f3456e;
                    throw new Exception(sb2);
                }
            }
            AbstractC3395e.ad(fileChannel, c18524e);
        }
        if (!c0829e.f3215e) {
            c0829e.f3220e = C12927e.metrica();
        }
        if (!c0829e.f3217e) {
            c0829e.f3214e = new C14267e();
        }
        EnumC1005e[] enumC1005eArr10 = EnumC1005e.f3456e;
        c7936e.getClass();
        int i4 = C1724e.ad;
        return c0829e;
    }
}
