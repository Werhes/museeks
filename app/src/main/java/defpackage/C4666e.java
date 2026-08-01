package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4666e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ List f9999e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ float f10000e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ float f10001e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f10002e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ float f10003e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f10004e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10005e = 1;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f10006e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f10007e;

    public /* synthetic */ C4666e(float f, InterfaceC3314e interfaceC3314e, float f2, float f3, InterfaceC3314e interfaceC3314e2, List list, InterfaceC3314e interfaceC3314e3, InterfaceC3314e interfaceC3314e4) {
        this.f10001e = f;
        this.f10007e = interfaceC3314e;
        this.f10000e = f2;
        this.f10003e = f3;
        this.f10006e = interfaceC3314e2;
        this.f9999e = list;
        this.f10002e = interfaceC3314e3;
        this.f10004e = interfaceC3314e4;
    }

    public /* synthetic */ C4666e(InterfaceC2235e interfaceC2235e, C16446e c16446e, C15134e c15134e, float f, float f2, float f3, List list, AbstractC4457e abstractC4457e) {
        this.f10007e = interfaceC2235e;
        this.f10006e = c16446e;
        this.f10002e = c15134e;
        this.f10001e = f;
        this.f10000e = f2;
        this.f10003e = f3;
        this.f9999e = list;
        this.f10004e = abstractC4457e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        long j2;
        switch (this.f10005e) {
            case 0:
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) this.f10007e;
                C16446e c16446e = (C16446e) this.f10006e;
                C15134e c15134e = (C15134e) this.f10002e;
                AbstractC4457e abstractC4457e = (AbstractC4457e) this.f10004e;
                C16446e c16446e2 = (C16446e) obj;
                interfaceC2235e.remoteconfig(c16446e.signatures, c16446e2, new C13749e(12, c16446e));
                C15074e c15074e = c15134e.ad;
                float f = this.f10001e;
                float f2 = this.f10000e;
                c16446e2.yandex(AbstractC15384e.vip(c15074e, f * f2, this.f10003e, this.f9999e, f2, abstractC4457e, null, 865));
                c16446e2.purchase(c15074e.f29851e);
                C17138e.metrica(interfaceC2235e, c16446e2);
                return Unit.INSTANCE;
            default:
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f10007e;
                InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) this.f10006e;
                InterfaceC3314e interfaceC3314e3 = (InterfaceC3314e) this.f10002e;
                InterfaceC3314e interfaceC3314e4 = (InterfaceC3314e) this.f10004e;
                InterfaceC2235e interfaceC2235e2 = (InterfaceC2235e) obj;
                boolean z = interfaceC2235e2.getLayoutDirection() == EnumC7792e.f15793e;
                float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC2235e2.mo779e() & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(r8) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2235e2.yandex() >> 32)) - this.f10001e;
                long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2235e2.mo779e() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                if (z) {
                    j2 = floatToRawIntBits;
                    j = floatToRawIntBits2;
                } else {
                    j = floatToRawIntBits;
                    j2 = j;
                }
                if (!z) {
                    j2 = floatToRawIntBits2;
                }
                long j3 = ((C3618e) interfaceC3314e.getValue()).ad;
                float f3 = this.f10000e;
                interfaceC2235e2.mo776extends(j3, j, j2, f3, (r19 & 16) != 0 ? 0 : 1);
                int i = (int) (j >> 32);
                float intBitsToFloat3 = Float.intBitsToFloat(i);
                float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat(i);
                float f4 = this.f10003e;
                long floatToRawIntBits3 = (Float.floatToRawIntBits(((Float.intBitsToFloat(r7) - Float.intBitsToFloat(i)) * 0.0f) + Float.intBitsToFloat(i)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2235e2.mo779e() & 4294967295L))) & 4294967295L);
                long j4 = j;
                long j5 = j2;
                interfaceC2235e2.mo776extends(((C3618e) interfaceC3314e2.getValue()).ad, floatToRawIntBits3, (Float.floatToRawIntBits((intBitsToFloat4 * f4) + intBitsToFloat3) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2235e2.mo779e() & 4294967295L))) & 4294967295L), f3, (r19 & 16) != 0 ? 0 : 1);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : this.f9999e) {
                    float floatValue = ((Number) obj2).floatValue();
                    Boolean valueOf = Boolean.valueOf(floatValue > f4 || floatValue < 0.0f);
                    Object obj3 = linkedHashMap.get(valueOf);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(valueOf, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        float intBitsToFloat5 = Float.intBitsToFloat((int) (AbstractC12246e.yandex(j4, j5, ((Number) list.get(i2)).floatValue()) >> 32));
                        arrayList.add(new C2152e((Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2235e2.mo779e() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat5) << 32)));
                        i2++;
                        j4 = j4;
                    }
                    long j6 = j4;
                    interfaceC2235e2.mo778e(arrayList, ((C3618e) (booleanValue ? interfaceC3314e3 : interfaceC3314e4).getValue()).ad, f3);
                    j4 = j6;
                }
                return Unit.INSTANCE;
        }
    }
}
