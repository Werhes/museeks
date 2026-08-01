package defpackage;

import ealvatag.tag.datatype.DataTypes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import org.xmlpull.v1.XmlPullParser;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4465e {
    public static final void ad(AbstractC11110e abstractC11110e, boolean z, Function1 function1, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(998761431);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(abstractC11110e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.billing(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            float f = 8;
            InterfaceC12864e smaato = AbstractC12220e.smaato(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), f, 0.0f, 2);
            if (z) {
                f = 0;
            }
            AbstractC18268e.vip(AbstractC12220e.loadAd(smaato, 0.0f, f, 0.0f, 0.0f, 13), AbstractC16497e.billing(4), null, null, 4, 0, AbstractC16653e.license(-1281451908, new C17630e(abstractC11110e, function1), c13770e), c13770e, 1597488, 44);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11935e(abstractC11110e, z, function1, i);
        }
    }

    public static String adcel(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return DataTypes.OBJ_NUMBER;
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static String appmetrica(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static String billing(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final long license(float[] fArr) {
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (i < fArr.length) {
            int i2 = i + 1;
            f += fArr[i];
            i += 2;
            f2 += fArr[i2];
        }
        return C9268e.ad(f / (fArr.length / 2), f2 / (fArr.length / 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C11913e metrica(float[] fArr, C17307e c17307e, AbstractList abstractList, float f, float f2) {
        float f3;
        int i;
        ArrayList arrayList;
        List singletonList;
        C4211e vip;
        C17307e c17307e2;
        Float valueOf = Float.valueOf(1.0f);
        if (fArr.length < 6) {
            throw new IllegalArgumentException("Polygons must have at least 3 vertices");
        }
        int i2 = 2;
        int i3 = 1;
        if (fArr.length % 2 == 1) {
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        if (abstractList != null && abstractList.size() * 2 != fArr.length) {
            throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
        }
        ArrayList arrayList2 = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList3 = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            C17307e c17307e3 = (abstractList == null || (c17307e2 = (C17307e) abstractList.get(i5)) == null) ? c17307e : c17307e2;
            int i6 = (((i5 + length) - 1) % length) * 2;
            int i7 = i5 + 1;
            int i8 = (i7 % length) * 2;
            int i9 = i5 * 2;
            arrayList3.add(new C14531e(C9268e.ad(fArr[i6], fArr[i6 + 1]), C9268e.ad(fArr[i9], fArr[i9 + 1]), C9268e.ad(fArr[i8], fArr[i8 + 1]), c17307e3));
            i5 = i7;
        }
        C15926e admob = AbstractC3062e.admob(0, length);
        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(admob, 10));
        Iterator it = admob.iterator();
        while (true) {
            C3296e c3296e = (C3296e) it;
            f3 = 0.0f;
            if (!c3296e.f7452e) {
                break;
            }
            int nextInt = c3296e.nextInt();
            int i10 = (nextInt + 1) % length;
            float f4 = ((C14531e) arrayList3.get(nextInt)).yandex + ((C14531e) arrayList3.get(i10)).yandex;
            float metrica = ((C14531e) arrayList3.get(i10)).metrica() + ((C14531e) arrayList3.get(nextInt)).metrica();
            int i11 = nextInt * 2;
            float f5 = fArr[i11];
            float f6 = fArr[i11 + 1];
            int i12 = i10 * 2;
            float f7 = f5 - fArr[i12];
            float f8 = f6 - fArr[i12 + 1];
            float f9 = AbstractC4424e.vip;
            float sqrt = (float) Math.sqrt((f8 * f8) + (f7 * f7));
            arrayList4.add(f4 > sqrt ? new C6571e(Float.valueOf(sqrt / f4), Float.valueOf(0.0f)) : metrica > sqrt ? new C6571e(valueOf, Float.valueOf((sqrt - f4) / (metrica - f4))) : new C6571e(valueOf, valueOf));
        }
        for (int i13 = 0; i13 < length; i13 = i + 1) {
            float[] fArr2 = new float[i2];
            int i14 = i4;
            int i15 = i14;
            while (i14 < i2) {
                int i16 = i4;
                C6571e c6571e = (C6571e) arrayList4.get((((i13 + length) - 1) + i14) % length);
                float f10 = f3;
                int i17 = i2;
                float billing = AbstractC1634e.billing(((C14531e) arrayList3.get(i13)).metrica(), ((C14531e) arrayList3.get(i13)).yandex, ((Number) c6571e.f13543e).floatValue(), ((C14531e) arrayList3.get(i13)).yandex * ((Number) c6571e.f13544e).floatValue());
                int i18 = i15 + 1;
                if (fArr2.length < i18) {
                    fArr2 = Arrays.copyOf(fArr2, Math.max(i18, (fArr2.length * 3) / 2));
                }
                fArr2[i15] = billing;
                i14++;
                f3 = f10;
                i15 = i18;
                i4 = i16;
                i2 = i17;
            }
            int i19 = i2;
            int i20 = i4;
            float f11 = f3;
            C14531e c14531e = (C14531e) arrayList3.get(i13);
            if (i15 <= 0) {
                AbstractC14783e.yandex("Index must be between 0 and size");
                throw null;
            }
            float f12 = fArr2[i20];
            if (i3 >= i15) {
                AbstractC14783e.yandex("Index must be between 0 and size");
                throw null;
            }
            float f13 = fArr2[i3];
            long j = c14531e.appmetrica;
            long j2 = c14531e.license;
            int i21 = i3;
            float f14 = c14531e.purchase;
            ArrayList arrayList5 = arrayList2;
            long j3 = c14531e.vip;
            float min = Math.min(f12, f13);
            float f15 = c14531e.yandex;
            if (f15 < 1.0E-4f || min < 1.0E-4f || f14 < 1.0E-4f) {
                i = i13;
                arrayList = arrayList4;
                c14531e.startapp = j3;
                float Signature = AbstractC11613e.Signature(j3);
                float admob2 = AbstractC11613e.admob(j3);
                float Signature2 = AbstractC11613e.Signature(j3);
                float admob3 = AbstractC11613e.admob(j3);
                singletonList = Collections.singletonList(AbstractC8217e.vip(Signature, admob2, AbstractC4424e.vip(Signature, Signature2, 0.33333334f), AbstractC4424e.vip(admob2, admob3, 0.33333334f), AbstractC4424e.vip(Signature, Signature2, 0.6666667f), AbstractC4424e.vip(admob2, admob3, 0.6666667f), Signature2, admob3));
            } else {
                float min2 = Math.min(min, f15);
                float ad = c14531e.ad(f12);
                float ad2 = c14531e.ad(f13);
                float f16 = (f14 * min2) / f15;
                float f17 = AbstractC4424e.vip;
                i = i13;
                float sqrt2 = (float) Math.sqrt((min2 * min2) + (f16 * f16));
                arrayList = arrayList4;
                long startapp = AbstractC11613e.startapp(2.0f, AbstractC11613e.isVip(j2, j));
                float mopub = AbstractC11613e.mopub(startapp);
                if (mopub <= f11) {
                    throw new IllegalArgumentException("Can't get the direction of a 0-length vector");
                }
                c14531e.startapp = AbstractC11613e.isVip(j3, AbstractC11613e.isPro(sqrt2, AbstractC11613e.startapp(mopub, startapp)));
                long isVip = AbstractC11613e.isVip(j3, AbstractC11613e.isPro(min2, j2));
                long isVip2 = AbstractC11613e.isVip(j3, AbstractC11613e.isPro(min2, j));
                C4211e vip2 = C14531e.vip(min2, ad, c14531e.vip, c14531e.ad, isVip, isVip2, c14531e.startapp, f16);
                C4211e vip3 = C14531e.vip(min2, ad2, c14531e.vip, c14531e.metrica, isVip2, isVip, c14531e.startapp, f16);
                float ad3 = vip3.ad();
                float vip4 = vip3.vip();
                float[] fArr3 = vip3.ad;
                C4211e vip5 = AbstractC8217e.vip(ad3, vip4, fArr3[4], fArr3[5], fArr3[i19], fArr3[3], fArr3[i20], fArr3[i21]);
                float Signature3 = AbstractC11613e.Signature(c14531e.startapp);
                float admob4 = AbstractC11613e.admob(c14531e.startapp);
                float ad4 = vip2.ad();
                float vip6 = vip2.vip();
                float[] fArr4 = vip5.ad;
                float f18 = fArr4[i20];
                float f19 = fArr4[i21];
                long ad5 = AbstractC4424e.ad(ad4 - Signature3, vip6 - admob4);
                float f20 = f18 - Signature3;
                float f21 = f19 - admob4;
                long ad6 = AbstractC4424e.ad(f20, f21);
                long ad7 = C9268e.ad(-AbstractC11613e.admob(ad5), AbstractC11613e.Signature(ad5));
                long ad8 = C9268e.ad(-AbstractC11613e.admob(ad6), AbstractC11613e.Signature(ad6));
                int i22 = (AbstractC11613e.admob(ad7) * f21) + (AbstractC11613e.Signature(ad7) * f20) >= f11 ? i21 : i20;
                float adcel = AbstractC11613e.adcel(ad5, ad6);
                if (adcel > 0.999f) {
                    vip = AbstractC8217e.vip(ad4, vip6, AbstractC4424e.vip(ad4, f18, 0.33333334f), AbstractC4424e.vip(vip6, f19, 0.33333334f), AbstractC4424e.vip(ad4, f18, 0.6666667f), AbstractC4424e.vip(vip6, f19, 0.6666667f), f18, f19);
                } else {
                    float sqrt3 = (((((float) Math.sqrt(i19 * r5)) - ((float) Math.sqrt(r9 - (adcel * adcel)))) * ((((float) Math.sqrt((r11 * r11) + (r10 * r10))) * 4.0f) / 3.0f)) / (i21 - adcel)) * (i22 != 0 ? 1.0f : -1.0f);
                    vip = AbstractC8217e.vip(ad4, vip6, (AbstractC11613e.Signature(ad7) * sqrt3) + ad4, (AbstractC11613e.admob(ad7) * sqrt3) + vip6, f18 - (AbstractC11613e.Signature(ad8) * sqrt3), f19 - (AbstractC11613e.admob(ad8) * sqrt3), f18, f19);
                }
                C4211e[] c4211eArr = new C4211e[3];
                c4211eArr[i20] = vip2;
                c4211eArr[1] = vip;
                c4211eArr[2] = vip5;
                singletonList = AbstractC6874e.startapp(c4211eArr);
            }
            arrayList5.add(singletonList);
            f3 = f11;
            arrayList2 = arrayList5;
            i4 = i20;
            arrayList4 = arrayList;
            i2 = 2;
            i3 = 1;
        }
        ArrayList arrayList6 = arrayList2;
        int i23 = i4;
        float f22 = f3;
        ArrayList arrayList7 = new ArrayList();
        int i24 = i23;
        while (i24 < length) {
            int i25 = i24 + 1;
            int i26 = i25 % length;
            int i27 = i24 * 2;
            long ad9 = C9268e.ad(fArr[i27], fArr[i27 + 1]);
            int i28 = (((i24 + length) - 1) % length) * 2;
            long ad10 = C9268e.ad(fArr[i28], fArr[i28 + 1]);
            int i29 = i26 * 2;
            long ad11 = C9268e.ad(fArr[i29], fArr[i29 + 1]);
            float f23 = AbstractC4424e.vip;
            long tapsense = AbstractC11613e.tapsense(ad9, ad10);
            long tapsense2 = AbstractC11613e.tapsense(ad11, ad9);
            arrayList7.add(new C2089e((List) arrayList6.get(i24), (AbstractC11613e.admob(tapsense2) * AbstractC11613e.Signature(tapsense)) - (AbstractC11613e.Signature(tapsense2) * AbstractC11613e.admob(tapsense)) > f22 ? 1 : i23));
            float ad12 = ((C4211e) AbstractC13480e.m3570break((List) arrayList6.get(i24))).ad();
            float vip7 = ((C4211e) AbstractC13480e.m3570break((List) arrayList6.get(i24))).vip();
            float f24 = ((C4211e) AbstractC13480e.m3591interface((List) arrayList6.get(i26))).ad[i23];
            float f25 = ((C4211e) AbstractC13480e.m3591interface((List) arrayList6.get(i26))).ad[1];
            arrayList7.add(new AbstractC8835e(Collections.singletonList(AbstractC8217e.vip(ad12, vip7, AbstractC4424e.vip(ad12, f24, 0.33333334f), AbstractC4424e.vip(vip7, f25, 0.33333334f), AbstractC4424e.vip(ad12, f24, 0.6666667f), AbstractC4424e.vip(vip7, f25, 0.6666667f), f24, f25))));
            i24 = i25;
        }
        long license = (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) ? license(fArr) : C9268e.ad(f, f2);
        float intBitsToFloat = Float.intBitsToFloat((int) (license >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (license & 4294967295L));
        if (arrayList7.size() < 2) {
            throw new IllegalArgumentException("Polygons must have at least 2 features");
        }
        C1169e license2 = AbstractC6874e.license();
        Iterator it2 = arrayList7.iterator();
        while (it2.hasNext()) {
            for (C4211e c4211e : ((AbstractC8835e) it2.next()).ad) {
                license2.add(Float.valueOf(c4211e.ad[i23]));
                license2.add(Float.valueOf(c4211e.ad[1]));
            }
        }
        float[] m3609volatile = AbstractC13480e.m3609volatile(AbstractC6874e.metrica(license2));
        if (Float.isNaN(intBitsToFloat)) {
            intBitsToFloat = Float.intBitsToFloat((int) (license(m3609volatile) >> 32));
        }
        if (Float.isNaN(intBitsToFloat2)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (license(m3609volatile) & 4294967295L));
        }
        return new C11913e(arrayList7, C9268e.ad(intBitsToFloat, intBitsToFloat2));
    }

    public static AbstractC13960e purchase(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException(AbstractC0054e.subs(cls, "Cannot create an instance of "));
            }
            try {
                return (AbstractC13960e) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(AbstractC0054e.subs(cls, "Cannot create an instance of "), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(AbstractC0054e.subs(cls, "Cannot create an instance of "), e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(AbstractC0054e.subs(cls, "Cannot create an instance of "), e3);
        }
    }

    public static boolean startapp(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static final void vip(CustomCatalogBlockItem customCatalogBlockItem, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(966115368);
        int i2 = i | (c13770e2.yandex(customCatalogBlockItem) ? 4 : 2) | (c13770e2.purchase(interfaceC12864e) ? 32 : 16);
        if (c13770e2.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            C14544e c14544e = C5438e.f11668e;
            InterfaceC12864e license = AbstractC18007e.license(interfaceC12864e, 56);
            C8587e ad = AbstractC6451e.ad(AbstractC16497e.ad, c14544e, c13770e2, 48);
            long j = c13770e2.f27286case;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, license);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e2, ad, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e2, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i3);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e2, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e2, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e2, purchase, c14865e4);
            C0115e c0115e = C0115e.f1276e;
            InterfaceC12864e advert2 = AbstractC12220e.advert(c0115e, 12, 8);
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            InterfaceC12864e premium = advert2.premium(new C5228e(1.0f, true));
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e2, 0);
            long j2 = c13770e2.f27286case;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert3 = c13770e2.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, premium);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, c14865e);
            AbstractC2270e.yandex(c13770e2, advert3, c14865e2);
            AbstractC13501e.mopub(i4, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase2, c14865e4);
            String str = customCatalogBlockItem.ad;
            String str2 = customCatalogBlockItem.vip;
            AbstractC14489e.vip(str, null, AbstractC0903e.license(c13770e2).admob, 0L, null, null, null, 0L, null, 0L, 2, false, str2.length() > 0 ? 1 : 2, 0, AbstractC0903e.billing(c13770e2).mopub, c13770e, 0, 384, 110586);
            c13770e2 = c13770e;
            if (str2.length() > 0) {
                c13770e2.m3676strictfp(1606149087);
                AbstractC14489e.vip(customCatalogBlockItem.vip, null, AbstractC0903e.license(c13770e2).remoteconfig, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, AbstractC0903e.billing(c13770e2).mopub, c13770e, 0, 24960, 110586);
                c13770e2 = c13770e;
            } else {
                c13770e2.m3676strictfp(1603035168);
            }
            c13770e2.Signature(false);
            c13770e2.Signature(true);
            InterfaceC12864e startapp = AbstractC12546e.startapp(AbstractC18007e.startapp(c0115e, 48).premium(new C8388e(c14544e)), 0.0f, 0.0f, 0.0f, 0.0f, null, false, 524031);
            float f = 10;
            InterfaceC12864e license2 = AbstractC16398e.license(AbstractC16136e.metrica(AbstractC12447e.vip(AbstractC6532e.applovin(startapp, f, f), AbstractC0903e.purchase(c13770e2).vip), AbstractC0903e.license(c13770e2).ads, AbstractC10432e.ad), 1, AbstractC0903e.purchase(c13770e2).vip, false, 28);
            InterfaceC2747e license3 = AbstractC17074e.license(C5438e.f11676e, false);
            long j3 = c13770e2.f27286case;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC3483e advert4 = c13770e2.advert();
            InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e2, license2);
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, license3, c14865e);
            AbstractC2270e.yandex(c13770e2, advert4, c14865e2);
            AbstractC13501e.mopub(i5, c13770e2, c14865e3, c13770e2, c5430e);
            AbstractC2270e.yandex(c13770e2, purchase3, c14865e4);
            List list = customCatalogBlockItem.metrica;
            AbstractC8461e.ad(list != null ? AbstractC8769e.metrica(100, list) : null, customCatalogBlockItem.ad, AbstractC18007e.metrica, C16477e.vip, null, c13770e2, 1573248, 1976);
            c13770e2.Signature(true);
            c13770e2.Signature(true);
        } else {
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C17785e(customCatalogBlockItem, interfaceC12864e, i, 23);
        }
    }

    public static boolean yandex(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }
}
