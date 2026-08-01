package defpackage;

import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4183e extends AbstractC1056e {
    @Override // defpackage.AbstractC1056e
    public final InterfaceC1425e appmetrica(FileChannel fileChannel, String str, boolean z) {
        C0829e ad = new C2321e(str).ad(fileChannel);
        int m2467class = AbstractC8703e.m2467class(C12927e.license().pro);
        if (m2467class == 4 || m2467class == 5 || m2467class == 6 || m2467class == 7) {
            C7936e c7936e = C0829e.f3213e;
            if (ad.purchase() instanceof C14267e) {
                try {
                    AbstractC7014e it = AbstractC5689e.f12082e.iterator();
                    while (it.hasNext()) {
                        EnumC8271e enumC8271e = (EnumC8271e) it.next();
                        if (((String) ad.f3214e.appmetrica(enumC8271e).appmetrica(BuildConfig.FLAVOR)).isEmpty() && !ad.f3220e.firebase(enumC8271e).isEmpty()) {
                            C14267e c14267e = ad.f3214e;
                            String firebase = ad.f3220e.firebase(enumC8271e);
                            if (!firebase.endsWith("\u0000")) {
                                firebase = firebase.concat("\u0000");
                            }
                            c14267e.mopub(enumC8271e, firebase);
                        }
                    }
                } catch (C12795e unused) {
                    EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                    c7936e.getClass();
                    int i = C1724e.ad;
                }
            } else {
                try {
                    AbstractC7014e it2 = AbstractC5689e.f12082e.iterator();
                    while (it2.hasNext()) {
                        EnumC8271e enumC8271e2 = (EnumC8271e) it2.next();
                        if (ad.f3220e.firebase(enumC8271e2).isEmpty()) {
                            String str2 = (String) ad.f3214e.appmetrica(enumC8271e2).appmetrica(BuildConfig.FLAVOR);
                            if (!str2.isEmpty()) {
                                AbstractC11095e abstractC11095e = ad.f3220e;
                                if (str2.endsWith("\u0000")) {
                                    str2 = str2.substring(0, str2.length() - 1);
                                }
                                abstractC11095e.mopub(enumC8271e2, str2);
                            }
                        }
                    }
                } catch (C12795e unused2) {
                    EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                    c7936e.getClass();
                    int i2 = C1724e.ad;
                }
            }
        }
        return ad;
    }

    @Override // defpackage.AbstractC1056e
    public final C0521e license(FileChannel fileChannel, String str) {
        C0521e c0521e = new C0521e();
        if (!AbstractC15365e.ad(fileChannel)) {
            throw new Exception(AbstractC10257e.adcel(str, " Wav RIFF Header not valid"));
        }
        while (fileChannel.position() < fileChannel.size()) {
            C18524e c18524e = new C18524e(ByteOrder.LITTLE_ENDIAN);
            c18524e.appmetrica(fileChannel);
            String str2 = (String) c18524e.f36317e;
            C7936e c7936e = C2400e.ad;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            AbstractC6069e.ad(c18524e.f36319e);
            c7936e.getClass();
            int i = C1724e.ad;
            EnumC2113e ad = EnumC2113e.ad(str2);
            if (ad != null) {
                int ordinal = ad.ordinal();
                if (ordinal == 0) {
                    C5957e c5957e = new C5957e(AbstractC1983e.startapp(fileChannel, (int) c18524e.f36318e), c18524e, 0);
                    c5957e.f12559e = c0521e;
                    c5957e.mo741e();
                } else if (ordinal == 1) {
                    c0521e.advert = AbstractC1983e.startapp(fileChannel, (int) c18524e.f36318e).getInt() & 4294967295L;
                } else if (ordinal == 2) {
                    c0521e.ad = c18524e.f36318e;
                    c0521e.vip = fileChannel.position();
                    c0521e.metrica = fileChannel.position() + c18524e.f36318e;
                    fileChannel.position(fileChannel.position() + c18524e.f36318e);
                } else if (ordinal != 6) {
                    fileChannel.position(fileChannel.position() + c18524e.f36318e);
                } else {
                    EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                    fileChannel.position(fileChannel.position() - 7);
                }
            } else {
                if (c18524e.f36318e < 0) {
                    StringBuilder isPro = AbstractC8703e.isPro(str, " Not a valid header, unable to read a sensible size:Header");
                    isPro.append((String) c18524e.f36317e);
                    isPro.append("Size:");
                    isPro.append(c18524e.f36318e);
                    String sb = isPro.toString();
                    EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
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
                    EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                    throw new Exception(sb2);
                }
            }
            AbstractC3395e.ad(fileChannel, c18524e);
        }
        if (c0521e.advert != -1) {
            if (c0521e.purchase > 0) {
                c0521e.mopub = ((float) r4) / r9;
            }
            return c0521e;
        }
        if (c0521e.ad <= 0) {
            throw new Exception(AbstractC10257e.adcel(str, " Wav Data Header Missing"));
        }
        c0521e.mopub = ((float) r4) / c0521e.smaato;
        return c0521e;
    }
}
